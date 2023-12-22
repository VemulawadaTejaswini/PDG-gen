//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    private static long evaluate(long a[], int N, long val)
    {
        long sum=0;
        for(int i=0;i<N;i++) sum+=a[i]^val;
        return sum;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        String s[]=br.readLine().trim().split(" ");
        N=Integer.parseInt(s[0]);
        long K=Long.parseLong(s[1]);

        s=br.readLine().trim().split(" ");
        long[] a=new long[N];
        for(i=0;i<N;i++) a[i]=Long.parseLong(s[i]);

        long max=evaluate(a,N,0);
        for(long cur=1;cur<=K;cur*=2) max=Math.max(max,evaluate(a,N,cur));
        System.out.println(max);
    }
}