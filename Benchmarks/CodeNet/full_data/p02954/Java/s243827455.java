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
  
	public static void main(String[] args) 
	{ 
		FastReader sc = new FastReader(); 
		char[] arr = sc.nextLine().toCharArray();
		int n = arr.length;
		int[] res = new int[n];
		int i=0;
		while(i<n){
			int r=0, ri=0, l=0, li=0;
			while(i<n && arr[i]=='R'){
				//System.out.println("1. "+i);
				r++;
				i++;
			}
			ri = i-1;
			li = i;

			while(i<n && arr[i]=='L'){
				//System.out.println("2. "+i);
				i++;
				l++;
			}
			
			res[ri] = (r+1)/2 + l/2;
			res[li] = r/2 + (l+1)/2;
		}
      
      	for(i=0;i<n;i++)
			System.out.print(res[i]+" "); 
	} 
} 
