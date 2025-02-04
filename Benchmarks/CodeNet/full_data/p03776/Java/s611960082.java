import java.io.*;
import java.util.*;
import java.math.BigInteger;

class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static long[][] dp;
	static Map<Double,Integer> m1=new HashMap<>();
	static long mod=(long)(1e9+7);
	
	static void brute(double[] a,int n,int a1,int b1)
	{
		double max=0;long ways=0;
		
		for(int i=1;i<(1<<n);i++)
		{
			double curr=0;
			for(int j=0;j<n;j++)
			{
				if((i&(1<<j))!=0)
				{
					curr+=a[j];
				}
			}
			
			double tot=Integer.bitCount(i);
			
			if(tot>=a1 && tot<=b1)
			{
				if(curr/tot>max)
				{
					max=curr/tot;ways=1;
				}
				else if(curr/tot==max)
				{
					ways++;
				}
			}
		}
		
		out.printf("%.20f\n%d\n",max,ways);
	}
	
    public static void main(String args[]) throws Exception
    {
		dp=new long[52][52];dp[0][0]=1;
		
		for(int i=1;i<52;i++)
		{
			for(int j=0;j<=i;j++)
			{
				dp[i][j]+=dp[i-1][j];
				
				if(j>0)
				{
					dp[i][j]+=dp[i-1][j-1];
				}
			}
		}
		
		int n=sc.nextInt(),a1=sc.nextInt(),b1=sc.nextInt();double[] a=new double[n];double max=0;
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextDouble();m1.put(a[i],m1.getOrDefault(a[i],0)+1);
		}
		
		
		Arrays.sort(a);double val1=0,val2=0;
		
		for(int i=n-1;i>=0;i--)
		{
			val1+=a[i];val2++;
			
			if(val2>=a1 && val2<=b1)
			{
				double now=val1/val2;
				
				if(now>max)
				{
					max=now;al.clear();al.add(i);
				}
				else if(now==max)
				{
					al.add(i);
				}
			}
		}
		
		long res=0;
		
		for(int i=0;i<al.size();i++)
		{
			int k=al.get(i);Map<Double,Integer> m2=new HashMap<>();
			
			for(int j=n-1;j>=k;j--)
			{
				m2.put(a[j],m2.getOrDefault(a[j],0)+1);
			}
			
			long curr=1;
			
			for(Map.Entry<Double,Integer> en:m2.entrySet())
			{
				int x=m1.get(en.getKey()),y=en.getValue();
				
				curr=(curr*dp[x][y]);
			}
			
			res=res+curr;
		}
		
		/*out.printf("%.20f\n",max);out.println(res);*/
		
		brute(a,n,a1,b1);out.close();
    }
}
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;

    public FastScanner(BufferedReader in) {
        this.in = in;
    }
	
    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
	
	public String next() throws Exception {
		return nextToken().toString();
	}
	
    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}