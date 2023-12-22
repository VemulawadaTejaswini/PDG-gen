import java.util.*;
import java.io.*;
public class Main
{
    public static int gcd(int a,int b)
    {
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        //String str[]=br.readLine().split(" ");
        //int n=Integer.parseInt(br.readLine());
        //int n=Integer.parseInt(str[0]);
        //int n=Integer.parseInt(str[1]);
        //String s=br.readLine();
        int n=Integer.parseInt(br.readLine());
        long sum=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                for(int k=1;k<=n;k++)
                {
                    int gcd1=gcd(Math.max(j,k),Math.min(j,k));
                    int gcd2=gcd(Math.max(i,gcd1),Math.min(i,gcd1));
                    sum=sum+gcd2;
                }
            }
        }
        pw.println(sum);
        pw.flush();
        pw.close();
    }
}