import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
	
	public static void main(String[] args) {
	
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		int v[]=new int[n+1];
		int num0[]=new int[100001];
		int num1[]=new int[100001];
		for (int i = 1; i <= n; i++) {
			v[i]=sc.nextInt();
			if(i%2==0) {
				num0[v[i]]++;
				
			}else {
				num1[v[i]]++;
			}
		}
		
		int x[]=new int[100001];
		int y[]=new int[100001];
		System.arraycopy(num0,0,x,0,100000);
		System.arraycopy(num1,0,y,0,100000);
		Arrays.sort(num0);
		Arrays.sort(num1);
		
		int ev1=num0[100000];
		int od1=num1[100000];
		int ev2=num0[99999];
		int od2=num1[99999];
		int ans=0;
		int eve_most=0;
		int odd_most=0;
		for (int i = 1; i <=100000; i++) {
			if(x[i]==ev1) {
				eve_most=i;
			}
			if(y[i]==od1) {
				odd_most=i;
			}
		}
		if(eve_most==odd_most) {
			
			if(ev1+od2>=ev2+od1) {
				ans=n-ev1-od2;
			}else {
				ans=n-ev2-od1;
			}
			
			
		}else {
			ans=n-ev1-od1;
			
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
