public class g{
    public static void main(String[] args){
        int x=98754;
        int m=x%10;
        for(int i=x;i>0;i/=10)
        {
            if(i%10>m)
            {
                m=i%10;
            }
        }
        System.out.println(m);
    }
}