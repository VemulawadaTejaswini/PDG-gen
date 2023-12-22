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
        long N=in.nextLong();
        int K=in.nextInt();
        long A[]=new long[(int)N];
        // Arrays.fill(A,0);
        for(int i=0; i<N; i++)A[i]=in.nextLong();
        //start at 0 and finish at
        // int i=0;
        long cost=0;
        long dp[]=new long[(int)N];
        dp[0]=0;
        for(int i=1; i<N; i++)
        {
            long max=(long)Math.pow(10,8);
            if(i>=K)            
            {
                for(int j=i-K; j<i; j++)
                {
                    max=Math.min(max,(Math.abs(A[i]-A[j])+dp[j]));
                }

            }
            else
            {
                for(int j=0; j<i; j++)
                {
                    max=Math.min(max,(Math.abs(A[i]-A[j])+dp[j]));
                }

            } dp[i]=max;
        }
        System.out.println(dp[(int)(N-1)]);
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