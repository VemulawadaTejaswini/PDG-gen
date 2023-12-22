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
		int n = sc.nextInt();
      	long arr[] = new long[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextLong();
      	for(int i=n-2;i>=0;i--){
            if(arr[i]-arr[i+1]>1){
              System.out.println("No");
              return;
            }else{
              if(arr[i]>arr[i+1])
                arr[i] = arr[i]-1;
            }
        }
		System.out.println("Yes"); 
	} 
} 
