
import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static int gcd(int a,int b)
    {
        if(b==0)
             return a;
        else
            return gcd(b,a%b);
    }

    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     long  sum=0;
     for(int i = 1; i<=n; i++)
     {
         for(int j=1;j<=n;j++)
         {
             for(int k=1;k<=n;k++)
                  sum+=gcd(i,gcd(j,k));
         }

     }

     System.out.println(sum);

    }
}
