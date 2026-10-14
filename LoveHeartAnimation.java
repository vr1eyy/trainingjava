
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LoveHeartAnimation extends JPanel {

    private static final int WIDTH = 1100;
    private static final int HEIGHT = 850;
    private static final int POINTS = 800;

    private double progress = 0;
    private final Timer timer;

    private final String[] loveWords = {
        "Love",          // 1. English
        "Amor",          // 2. Spanish
        "Amour",         // 3. French
        "Liebe",         // 4. German
        "Amore",         // 5. Italian
        "Amor",          // 6. Portuguese
        "Liefde",        // 7. Dutch
        "Kärlek",        // 8. Swedish
        "Kjærlighet",    // 9. Norwegian
        "Kærlighed",     // 10. Danish
        "Rakkaus",       // 11. Finnish
        "Miłość",        // 12. Polish
        "Láska",         // 13. Czech
        "Αγάπη",         // 14. Greek
        "Любовь",        // 15. Russian
        "حب",            // 16. Arabic
        "प्यार",         // 17. Hindi
        "அன்பு",         // 18. Tamil
        "ప్రేమ",         // 19. Telugu
        "爱",             // 20. Chinese
        "愛",             // 21. Japanese
        "사랑"            // 22. Korean
    };

    public LoveHeartAnimation() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);

        timer = new Timer(20, e -> {
            if (progress < 1.0) {
                progress = Math.min(1.0, progress + 0.003);
                repaint();
            } else {
                timerStop();
            }
        });

        timer.start();
    }

    private void timerStop() {
        timer.stop();
    }

    // Heart equation: the first and last points are identical.
    private Point2D.Double heartPoint(double t) {
        double x = 16 * Math.pow(Math.sin(t), 3);

        double y = 13 * Math.cos(t)
                - 5 * Math.cos(2 * t)
                - 2 * Math.cos(3 * t)
                - Math.cos(4 * t);

        double scaleX = 25;
        double scaleY = 22;

        return new Point2D.Double(
                WIDTH / 2.0 + x * scaleX,
                HEIGHT / 2.0 - y * scaleY
        );
    }

    private double heartAngle(double t) {
        double dt = 0.001;

        Point2D.Double p1 = heartPoint(t - dt);
        Point2D.Double p2 = heartPoint(t + dt);

        return Math.atan2(
                p2.y - p1.y,
                p2.x - p1.x
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2.setRenderingHint(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON
        );

        // Black background
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, WIDTH, HEIGHT);

        // Draw the heart from its starting point.
        Path2D.Double heart = new Path2D.Double();

        Point2D.Double first = heartPoint(0);
        heart.moveTo(first.x, first.y);

        int visiblePoints = (int) (POINTS * progress);

        for (int i = 1; i <= visiblePoints; i++) {
            double t = 2 * Math.PI * i / POINTS;
            Point2D.Double p = heartPoint(t);
            heart.lineTo(p.x, p.y);
        }

        // Red glow effect
        g2.setColor(new Color(100, 0, 0));
        g2.setStroke(new BasicStroke(
                14, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND
        ));
        g2.draw(heart);

        g2.setColor(new Color(200, 0, 25));
        g2.setStroke(new BasicStroke(
                6, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND
        ));
        g2.draw(heart);

        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(
                2.5f, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND
        ));
        g2.draw(heart);

        // Place all 22 translations around the heart.
        int count = loveWords.length;
        Font font = new Font("Serif", Font.BOLD, 21);

        for (int i = 0; i < count; i++) {

            double t = 2 * Math.PI * i / count;

            // Reveal each word as the line reaches it.
            if (t / (2 * Math.PI) > progress) {
                continue;
            }

            Point2D.Double p = heartPoint(t);
            double angle = heartAngle(t);

            // Keep the text upright and readable.
            if (angle > Math.PI / 2 || angle < -Math.PI / 2) {
                angle += Math.PI;
            }

            // Offset text slightly outward from the heart.
            double dx = p.x - WIDTH / 2.0;
            double dy = p.y - HEIGHT / 2.0;
            double length = Math.hypot(dx, dy);

            double offset = 25;

            double textX = p.x + offset * dx / length;
            double textY = p.y + offset * dy / length;

            AffineTransform oldTransform = g2.getTransform();

            g2.translate(textX, textY);
            g2.rotate(angle);
            g2.setFont(font);

            FontMetrics fm = g2.getFontMetrics();
            int textWidth = fm.stringWidth(loveWords[i]);

            // Glow behind the word
            g2.setColor(new Color(130, 0, 0));
            g2.drawString(
                    loveWords[i],
                    -textWidth / 2 + 1,
                    1
            );

            // Bright red text
            g2.setColor(new Color(255, 25, 45));
            g2.drawString(
                    loveWords[i],
                    -textWidth / 2,
                    0
            );

            g2.setTransform(oldTransform);
        }

        // A small heart at the starting point.
        if (progress > 0) {
            g2.setFont(new Font("Serif", Font.BOLD, 30));
            g2.setColor(Color.RED);
            g2.drawString("♥",
                    (int) first.x - 12,
                    (int) first.y - 8);
        }

        g2.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Love in 22 Languages");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new LoveHeartAnimation());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }
}
