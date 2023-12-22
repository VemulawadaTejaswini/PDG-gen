import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	
		MyScanner sc = new MyScanner();
		long k=sc.nextLong();
		long a=sc.nextLong();
		long b=sc.nextLong();
		long ans=0;
		if(a>=b) {
			ans=k+1;
		}
		else if(b-a==1) {
			if(2*a+1>=k) {
				ans=k+1;
			}
			else {
				Long count=(k-2*a+1)/2;
				ans+=2*a+(long)Math.pow(2,count+1)-2;
				if((k-2*a+1)%2==1) {
					ans+=1;
				}
			}
		}
		else {
			if(a+1>=k) {
				ans=k+1;
			}
			else {
				long d=b-a;
				long count2=(k-a+1)/2;
				long y=(long)Math.pow(d,count2+1);
				ans+=a+(y-d)/(d-1);
				if((k-a+1)%2==1) {
					ans+=1;
				System.out.println();
				}
			}	
		}
		System.out.println(ans);
	
		
	}	
	
	
	
//----------------------------------------------------------
	static int l_min(int[] a) {
		Arrays.sort(a);
		return a[0];
	}
	static int l_max(int[] a) {
		int l=a.length;
		Arrays.sort(a);
		return a[l-1];
	}
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	

}



