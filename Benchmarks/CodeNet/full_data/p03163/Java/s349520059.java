import java.util.*;
import java.io.*;
public class Main
{
	static StringBuilder sb;
	public static final boolean ONLINE_JUDGE=false;
	public static void main(String []args)throws IOException
	{
		sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		if(ONLINE_JUDGE)
		{
			File file=new File("output.txt");
			sc=new Scanner(new FileReader(new File("input.txt")));
			PrintStream ps=new PrintStream(file);
			System.setOut(ps);
		}
		int t=1;
		for(int tt=1;tt<=t;tt++)
		{
			int n=sc.nextInt();
			int w=sc.nextInt();
			int we[]=new int[n+1];
			long v[]=new long[n+1];
			for(int i=1;i<=n;i++)
			{
				we[i]=sc.nextInt();
				v[i]=sc.nextLong();
			}
			long dp[][]=new long[n+1][w+1];
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<w+1;j++)
				{
					if(j<we[i])
					{
						dp[i][j]=dp[i-1][j];
						continue;
					}
					dp[i][j]=Math.max(dp[i-1][j-we[i]]+v[i],dp[i-1][j]);
				}
			}
			sb.append(dp[n][w]);
		}
		System.out.print(sb);
	}  
}
/*class Helper
{
    long fact[]=new long[1000001];
    boolean prime[]=new boolean[1000001];
    
    public long fastpower(long base,long power,long mod)
    {
        long result = 1;
        while(power > 0)
        {   
            if(power % 2 == 1)
            {
                result=(result*base)%mod;
            }
            base=(base*base)%mod;
            power=power/2;
       	}
        return result;
    }
    public long multiplicative_inverse(long a,long m)
    {
        return fastpower(a,m-2,m);
    }
    public void fillFactorial(int n)
    {
        fact[0]=fact[1]=1;
        for(int i=2;i<n;i++)
   	        fact[i]=(fact[i-1]*i)%MODULO;
    }
    public void fillPrime(int n)
    {
        for(int i=0;i<n;i++)
            prime[i]=true;
        prime[1]=prime[0]=false;
        for(int i=2;i*i<n;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<n;j=j+i)
                    prime[j]=false;
            }
        }
    }
    public long gcd(long a,long b)
    {
        if(a==0)
            return b;
        else    
            return gcd(b%a,a);
    }
}
class FastReader 
{

    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;

    FastReader(InputStream is) {
        in = is;
    }

    int scan() throws IOException {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0) {
                return -1;
            }
        }
        return buf[index++];
    }

    String next() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }
    char nextChar() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        return (char) c;
    }

    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }

    long nextLong() throws IOException {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
}*/