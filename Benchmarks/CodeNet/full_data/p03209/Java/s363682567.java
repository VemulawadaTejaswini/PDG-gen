import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		long x=sc.nextLong();
		long l[]=new long[n+1];
		long p[]=new long[n+1];
		for(int i=1;i<=n;i++) {
			l[i]=(long)Math.pow(2,i+2)-3;
			p[i]=(long)Math.pow(2,i+1)-1;
		}
		long ans=0;
		int now=n;
		boolean fin=false;
			while(!fin) {
				if(now==1) {
					if(x<=4) {
						ans+=x-1;
					}
					else if(x==5) {
						ans+=3;
					}
					fin=true;
					break;
				}
					
				if(x==1||x==l[now]) {
					ans+=0;
					fin=true;
					break;
				}
				
				else if(x==(l[now]+1)/2) {
					ans+=p[now-1]+1;
					fin=true;
					
					break;
				}
				else if(x<(l[now]+1)/2) {
					now--;
					x--;
				}
				else if(x>(l[now]+1)/2) {
					ans+=p[now-1]+1;
					x-=(l[now]+1)/2;
					now--;
				}
		
			}
		System.out.println(ans);
	}
		
	//-----------http://codeforces.com/blog/entry/7018---------------------------------
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
	//--------------------------------------------------------

}



