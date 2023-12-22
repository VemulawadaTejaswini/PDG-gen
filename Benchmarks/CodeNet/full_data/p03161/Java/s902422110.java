import java.util.*;
import java.io.*;
public class Main{
	
	public static void main(String[] args)
	{
		FastScanner fs=new FastScanner();
		int n=fs.nextInt();
		int k=fs.nextInt();
		int arr[]=fs.readArray(n);
		int dp[]=new int[n];
		Arrays.fill(dp,(int)1e9);
		dp[0]=0;
		for(int i=1;i<n;i++)
		{
			for(int j=i>=k ? i-k:0;j<i;j++)
			{
				dp[i]=Math.min(dp[i],dp[j]+Math.abs(arr[j]-arr[i]));
			}
		}
//		System.out.println(Arrays.toString(dp));
		System.out.println(dp[n-1]);
	}
}
class FastScanner 
{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() 
		{
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
			
		}
		long pow(long x,long n)
		{
			long res=1;
			while(n>0)
			{
			   	if(n%2!=0)
			   	{
			   		res=(res*x);n--;
			   	}
			   	else
			   	{
			   		x=(x*x);n/=2;
			   	}
			}
			return res;
		}
		int gcd(int a,int b)
		{
			if(b==0)
			{
				return a;
			}
			return gcd(b,a%b);
		}
		long longgcd(long a,long b)
		{
			if(b==0)
			{
				return a;
			}
			return longgcd(b,a%b);
		}
		int[] sort(int arr[])
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i:arr)list.add(i);
			Collections.sort(list);
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=list.get(i);
			}
			return arr;
		}
		char[] charsort(char arr[])
	        {
	    	ArrayList<Character> list = new ArrayList<>();
	    	for(char c:arr)list.add(c);
	    	Collections.sort(list);
	    	for(int i=0;i<list.size();i++)
	    	{
	    		arr[i]=list.get(i);
	    	}
	    	return arr;
	        }
		long[] longsort(long arr[])
		{
			ArrayList<Long> list = new ArrayList<Long>();
			for(long i:arr)list.add(i);
			Collections.sort(list);
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=list.get(i);
			}
			return arr;
		}
		public int nextInt() 
		{
			return Integer.parseInt(next());
		}
		public int[] readArray(int n)
		{
			int[] arr=new int[n];
			for (int i=0; i<n; i++) arr[i]=nextInt();
			return arr;
		}	
		public long nextLong()
		{
			return Long.parseLong(next());
		}
		public double nextDouble()
		{
			return Double.parseDouble(next());
		}
		public long[] longreadArray(int n) 
		{
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
		}
}