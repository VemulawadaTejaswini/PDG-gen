import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
	
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int l[]=new int[8];
		for (int i = 0; i < n; i++) {
			l[i]=sc.nextInt();
		}
		int ans=1000000000;
		int temp;
		int x[]=new int[8];
		int la=0;
		int lb=0;
		int lc=0;
		int ld=0;
		int c0=0;
		int c1=0;
		int c2=0;
		for(x[0] = 0; x[0] < 4; x[0]++) {
			for (x[1] = 0; x[1] < 4; x[1]++) {
				for (x[2] = 0; x[2] < 4; x[2]++) {
					for (x[3] = 0; x[3] < 4; x[3]++) {
						for(x[4] = 0; x[4] < 4; x[4]++) {
							for (x[5] = 0; x[5]< 4; x[5]++) {
								for (x[6] = 0; x[6] < 4; x[6]++) {
									for (x[7] = 0; x[7] < 4; x[7]++) {
										
										for(int i=0;i<8;i++) {
											switch(x[i]) {
											case(0):
												la+=l[i];
												
												c0++;
												break;
											case(1):
												lb+=l[i];
											
												c1++;
												break;
											case(2):	
												lc+=l[i];
											
												c2++;
												break;
											case(3):
												ld+=l[i];
											}
										}
										if(la!=0&&lb!=0&&lc!=0) {
											temp=Math.abs(la-a)+Math.abs(lb-b)+Math.abs(lc-c);		
											
											temp+=10*(c0+c1+c2-3);
											ans=Math.min(temp,ans);
										}
										la=0;
										lb=0;
										lc=0;
										ld=0;
										c0=0;
										c1=0;
										c2=0;
										
										
										
								
									}
								}
							}
						}	
					}
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
