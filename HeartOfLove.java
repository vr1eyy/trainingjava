import java.util.ArrayList;
import java.util.List;

public class HeartOfLove {
    public static void main(String[] args) {
        // 1. List of "Love" in 22 different languages
        List<String> loveWords = new ArrayList<>();
        loveWords.add("LOVE");         // English
        loveWords.add("AMOUR");        // French
        loveWords.add("AMOR");         // Spanish / Portuguese
        loveWords.add("AMORE");        // Italian
        loveWords.add("LIEBE");        // German
        loveWords.add("LIEFDE");       // Dutch
        loveWords.add("KÄRLEK");       // Swedish
        loveWords.add("KJÆRLEIK");     // Norwegian
        loveWords.add("RAKKAUS");      // Finnish
        loveWords.add("CUBUK");        // Turkish (Aşk / Sevgi - using ASCII friendly variant)
        loveWords.add("MILOSC");       // Polish (Miłość)
        loveWords.add("LUBOV");        // Russian (Lyubov)
        loveWords.add("AGAPE");        // Greek
        loveWords.add("AHAVA");        // Hebrew
        loveWords.add("HUBB");         // Arabic
        loveWords.add("PREM");         // Hindi
        loveWords.add("PYAR");         // Urdu
        loveWords.add("AI");           // Chinese / Japanese
        loveWords.add("SARANG");       // Korean
        loveWords.add("CINTA");        // Indonesian / Malay
        loveWords.add("MAHAL");        // Tagalog
        loveWords.add("YEU");          // Vietnamese

        // 2. Flatten the list into a single character stream for printing
        StringBuilder textStream = new StringBuilder();
        for (String word : loveWords) {
            textStream.append(word).append(" ");
        }
        String text = textStream.toString();
        int charIndex = 0;

        // 3. ANSI Escape Codes for Red Color
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";

        // 4. Generate the heart shape using a mathematical formula
        // Adjusting steps to balance width and height aspect ratio in terminal fonts
        for (double y = 1.3; y >= -1.1; y -= 0.06) {
            for (double x = -1.2; x <= 1.2; x += 0.025) {
                
                // Heart equation: (x^2 + y^2 - 1)^3 - x^2 * y^3 <= 0
                double equation = Math.pow(x * x + y * y - 1, 3) - x * x * Math.pow(y, 3);
                
                if (equation <= 0.0) {
                    // Inside the heart: print character from our text in red
                    char c = text.charAt(charIndex % text.length());
                    System.out.print(ANSI_RED + c);
                    charIndex++;
                } else {
                    // Outside the heart: print empty space
                    System.out.print(" ");
                }
            }
            System.out.println(ANSI_RESET); // Reset formatting at the end of each line
        }
    }
}