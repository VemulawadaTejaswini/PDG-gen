import java.util.*;
import java.io.*;

class Mathfunc
{
    static public long gcd(long a,long b)
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
        long x,y;
        x=s1.nextLong();
        y=s1.nextLong();
        long gcd1=Mathfunc.gcd(x,y);
        long ans=1;
        for(long i=2;i*i<=gcd1;i++)
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