//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        N=Integer.parseInt(br.readLine().trim());
        String s[]=br.readLine().trim().split(" ");
        int a[]=new int[N];
        for(i=0;i<N;i++) a[i]=Integer.parseInt(s[i]);

        int count=0;
        for(i=1;i<N-1;i++)
        {
            if(a[i]<=a[i-1]&&a[i]>=a[i+1]) count++;
            else if(a[i]>=a[i-1]&&a[i]<=a[i+1]) count++;
        }
        System.out.println(count);
    }
}