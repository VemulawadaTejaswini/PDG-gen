
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {

	public static final int mod=(int)1e9+7;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out=new PrintWriter (new BufferedOutputStream(System.out));
		FastReader s=new FastReader();
		int n=s.nextInt();
		int m=s.nextInt();
		long[][] arr=new long[n][m];
		for(int i=0;i<n;i++) {
			String str=s.next();
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='#') {
					arr[i][j]=-1;
				}
			}
		}
		arr[0][0]=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==-1) {
					continue;
				}
				if(i-1>=0 && arr[i-1][j]!=-1) {
					arr[i][j]=(arr[i][j]+arr[i-1][j])%mod;
				}
				if(j-1>=0 && arr[i][j-1]!=-1) {
					arr[i][j]=(arr[i][j]%mod+arr[i][j-1]%mod)%mod;
				}
			}
		}
		out.println(arr[n-1][m-1]);
		out.close();
	}

	public static PrintWriter out;
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		//it reads the data about the specified point and divide the data about it ,it is quite fast
		//than using direct 

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
}
