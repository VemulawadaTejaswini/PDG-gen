import java.io.*; 
import java.util.*; 

public class Main{

	static class FastReader{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) 
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
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	}

	static boolean check(long n, long s){
		long sum=0, num=n;
		
		while(n>0){
			sum += (n%10);
			n/=10;
		}


		return ((num-sum)<s);


	} 

	static long find(long start, long end, long s){
		
		while(start<end){
			
			long mid = (start+end)/2;
			System.out.println(mid+" "+s+" "+check(mid, s));

			if(check(mid, s)){
				start = mid+1;
			}else{
				end = mid;
			}

		}

		return end-1;
	}

	public static void main(String[] args) 
	{ 
		FastReader sc = new FastReader(); 
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
		System.out.println(c-Math.min(c, a-b)); 
	} 
} 
