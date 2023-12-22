import java.io.*;
import java.util.*;
import java.math.*;
import java.math.BigInteger;
class Main
{    
    public static void main(String args[])
    {
        StringBuilder ans=new StringBuilder();
        FastReader in=new FastReader();    
        int N=in.nextInt();
        int W=in.nextInt();
        int wt[]=new int[N];
        long value[]=new long[N];
        long dp[][]=new long[N+1][W+1];
        System.out.println(f(value,wt,W,N));
        // System.out.println(dp[(int)(N-1)]);
    }
    //static int dp[][]=new int[N+1][W+1];
    static long f(long price[], int wt[],int W, int n)
    {
        if(n==0 || W==0)return 0;
        if(wt[n-1]<=W)
        return Math.max(price[n-1]+f(price,wt,W-wt[n-1],n-1),f(price,wt,W,n-1));
        else return f(price,wt,W,n-1);
    }

    static  long pow(long a,long b)
    {
        long mod=1000000007;
        long pow=1;
        long x=a;
        while(b!=0)
        {
            if((b&1)!=0)pow=(pow*x)%mod;
            x=(x*x)%mod;
            b/=2;
        }
        return pow;
    }

    static int bits(long x)
    {
        int n=(int)(Math.floor(Math.log(x)/Math.log(2)))+1;
        return (1<<n);
    }

    static long rev(long x)
    {
        int n=(int)(Math.floor(Math.log(x)/Math.log(2)))+1;

        return ((1<<n)-1)^x;
    }
    //fucntions
    //fucntions
    //fucntions
    //fucntions
    static int[] input(int A[]) //input of Int Array
    {
        FastReader in=new FastReader();
        int N=A.length;
        for(int i=0; i<N; i++)
        {
            A[i]=in.nextInt();
        }
        return A;
    }

    static long[] input(long A[]) //Input of long Array
    {
        FastReader in=new FastReader();
        for(int i=0; i<A.length; i++)A[i]=in.nextLong();
        return A;
    }

    static long lcm(long a,long b)
    {
        return (a*b)/GCD(a,b);
    }

    static long GCD(long a,long b) //wrong output if a ||b are intially zero
    {
        if(b==0)
        {
            return a;
        }
        else return GCD(b,a%b );
    }

    static boolean isPrime(int N)
    {
        for(int i=2; i*i<N; i++)
            if(N%i==0)return false;
        return true;
    }

}
//Code For FastReader
//Code For FastReader
//Code For FastReader
//Code For FastReader
class FastReader
{
    BufferedReader br;
    StringTokenizer st;
    public FastReader()
    {
        br=new BufferedReader(new InputStreamReader(System.in));
    }

    String next()
    {
        while(st==null || !st.hasMoreElements())
        {
            try
            {
                st=new StringTokenizer(br.readLine());
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str="";
        try
        {
            str=br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }

}