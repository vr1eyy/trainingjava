public class d{
    public static void main(String [] args){
        int x=8;
        int y=12;
        int z=15;
        while(x<y)
        {
            if(z%2==0)
            {
                x+=z%10;
            }else{
                y+=3;
            }
        z++;
    }
    System.out.println(z);
}
}