import java.io.*;
import java.util.*;
// public final class code
public class Main
// class code
// public class Solution
{
    static void solve()throws IOException
    {
        int n=nextInt();
        int matrix[][]=new int[10][10];
        for(int i=1;i<=n;i++)
        {
            int end=i%10;
            int j=i;
            int start=0;
            while(j>0)
            {
                start=j%10;
                j=j/10;
            }
            matrix[start][end]++;
        }
        // for(int i=0;i<=9;i++)
        // {
        //     for(int j=0;j<=9;j++)
        //         out.print(matrix[i][j]+" ");
        //     out.println();
        // }
        long ans=0;
        for(int i=1;i<=n;i++)
        {
            int end=i%10;
            int j=i;
            int start=0;
            while(j>0)
            {
                start=j%10;
                j=j/10;
            }
            // out.println(i+" "+matrix[end][start]);
            ans+=matrix[end][start];
        }
        out.println(ans);
    }
     
    ///////////////////////////////////////////////////////////

    public static void main(String args[])throws IOException
    {
        br=new BufferedReader(new InputStreamReader(System.in));
        out=new PrintWriter(new BufferedOutputStream(System.out));
        
        solve();
         
        // int t=nextInt();
        // for(int i=1;i<=t;i++)
        // {
        //    // out.print("Case #"+i+": ");
        //     solve();
        // }
         
        out.close();
    }
     
    static final long mod=(long)(1e9+7);
    static final int inf=(int)(1e9+1);
    static final int maxn=(int)(1e6);
    // static final long inf=(long)(1e18);
     
    static class Pair implements Comparable<Pair>
    {
        int first,second;
        Pair(int a,int b)
        {
            first=a;
            second=b;
        }
        public int compareTo(Pair p)
        {
            return first==p.first?second-p.second:first-p.first;
        }
        public boolean equals(Object o)
        {
            if(o==null)
                return false;
            Pair p=(Pair)o;
            return first==p.first?second==p.second:false;
        }
        public int hashCode()
        {
            return (int)((1l*first*inf+second)%mod);
        }
        public String toString()
        {
            return first+" "+second;
        }
    }
    static class Triplet implements Comparable<Triplet>
    {
        int first,second,third;
        Triplet(int a,int b,int c)
        {
            first=a;
            second=b;
            third=c;
        }
        public int compareTo(Triplet p)
        {
            return first-p.first;
        }
        public String toString()
        {
            return first+" "+second+" "+third;
        }
    }
    
    static long modinv(long x)
    {
        return modpow(x,mod-2);
    }
    static long modpow(long a,long b)
    {
        if(b==0)
            return 1;
        long x=modpow(a,b/2);
        x=(x*x)%mod;
        if(b%2==1)
            return (x*a)%mod;
        return x;
    } 
    static long gcd(long a,long b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    static int max(int ... a)
    {
    int ret=a[0];
    for(int i=1;i<a.length;i++)
    ret=Math.max(ret,a[i]);
    return ret;
    }
    static int min(int ... a)
    {
    int ret=a[0];
    for(int i=1;i<a.length;i++)
    ret=Math.min(ret,a[i]);
    return ret;
    }
    static void debug(Object ... a)
    {
    System.out.print("> ");
    for(int i=0;i<a.length;i++)
    System.out.print(a[i]+" ");
    System.out.println();
    }
    static void debug(int a[]){debuga(Arrays.stream(a).boxed().toArray());}
    static void debug(long a[]){debuga(Arrays.stream(a).boxed().toArray());}
    static void debuga(Object a[])
    {
    System.out.print("> ");
    for(int i=0;i<a.length;i++)
    System.out.print(a[i]+" ");
    System.out.println();
    }
    static Random random;
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;
    static String nextToken()throws IOException
    {
    while(st==null || !st.hasMoreTokens())
    st=new StringTokenizer(br.readLine());
    return st.nextToken();
    }
    static String nextLine()throws IOException
    {
    return br.readLine();
    }
    static int nextInt()throws IOException
    {
    return Integer.parseInt(nextToken());
    }
    static long nextLong()throws IOException
    {
    return Long.parseLong(nextToken());
    }
    static double nextDouble()throws IOException
    {
    return Double.parseDouble(nextToken());
    }
}