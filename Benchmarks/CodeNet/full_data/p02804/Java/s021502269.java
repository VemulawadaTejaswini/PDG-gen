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
        int k=nextInt();
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++)
            a[i]=nextInt();
        Arrays.sort(a,1,n+1);
        if(k==1)
        {
            out.println(0);
            return;
        }
        fact=new long[n+1];
        fact[0]=1;
        for(int i=1;i<=n;i++)
            fact[i]=(fact[i-1]*i)%mod;
        long sum=0;
        for(int i=1;i<=n;i++)
        {
            long x=(a[i]*C(i-1,k-1))%mod;
            sum=(sum+x)%mod;
            x=(a[i]*C(n-i,k-1))%mod;
            sum=(sum-x+mod)%mod;
        }
        out.println(sum);

    }
    static long fact[];
    static long C(int n,int r)
    {
        if(r>n)
            return 0;
        long x=fact[n];
        long y=(fact[r]*fact[n-r])%mod;
        y=modinv(y);
        x=(x*y)%mod;
        return x;
    }

    
     
    ///////////////////////////////////////////////////////////
    public static void main(String args[])throws IOException
    {
        br=new BufferedReader(new InputStreamReader(System.in));
        out=new PrintWriter(new BufferedOutputStream(System.out));
        random=new Random();
         
        solve();
         
        // int t=nextInt();
        // for(int i=1;i<=t;i++)
        // {
        //    // out.print("Case #"+i+": ");
        //     solve(i);
        // }
         
        out.close();
    }
     
    static final long mod=(int)(1e9+7);
    static final int inf=(int)(1e9+1);
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
            return third-p.third;
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