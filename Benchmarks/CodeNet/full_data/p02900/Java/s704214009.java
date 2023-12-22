import java.util.*;
import java.io.*;

class Mathfunc
{
    static public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}

public class Main 
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int x,y;
        x=s1.nextInt();
        y=s1.nextInt();
        int gcd1=Mathfunc.gcd(x,y);
        int ans=1;
        for(int i=2;i*i<=gcd1;i++)
        {
            if(gcd1%i==0)
            {
                ans++;
                while (gcd1%i==0)
                {
                    gcd1=gcd1/i;
                }
                
            }
        }
        if(gcd1!=1)
        {
            ans++;
        }
        System.out.print(ans);
    }
}