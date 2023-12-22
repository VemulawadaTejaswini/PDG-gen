import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        long n=Long.parseLong(br.readLine());
        int cntr=0;
        for(long i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(i!=n/i)
                {
                    long temp=n;
                    while(temp%i==0)
                    temp/=i;
                    if(temp==1||temp%i==1)
                    cntr++;
                    temp=n;
                    long div=n/i;
                    while(temp%div==0)
                    temp/=div;
                    if(temp==1||temp%div==1)
                    cntr++;
                }
                else
                {
                    long temp=n;
                    while(temp%i==0)
                    temp/=i;
                    if(temp==1||temp%i==1)
                    cntr++;
                }
            }
            else
            {
                if(n%i==1)
                cntr++;
                long temp=n;
                long div=n/i;
                if(div!=i)
                {
                if(temp%div==1)
                cntr++;
                else
                {
                    while(temp%div==0)
                    temp/=div;
                    if(temp==1||temp%div==1)
                    cntr++;
                }
                }
            }
        }
        pw.println(cntr+2);
        pw.flush();
        pw.close();
    }
}