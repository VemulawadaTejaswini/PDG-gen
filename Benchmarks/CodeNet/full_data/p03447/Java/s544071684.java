import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int a,b,c,x;
        int output=0;
        int i,j,k;

        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        x=scan.nextInt();

        for(i=0;i<=a;i++)
        {
            for(j=0;j<=b;j++)
            {
                for(k=0;k<=c;k++)
                {
                    if(500*i+100*j+k*50==x)
                    {
                        output++;
                    }
                }
            }
        }
        System.out.println(output);
    } 
}