
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out=new PrintWriter (new BufferedOutputStream(System.out));
		FastReader s=new FastReader();
		int n=s.nextInt();
		int[][] arr=new int[n][3];
		for(int i=0;i<n;i++) {
			arr[i][0]=s.nextInt();
			arr[i][1]=s.nextInt();
			arr[i][2]=s.nextInt();
		}
		for(int i=n-2;i>=0;i--) {
			arr[i][0]+=Integer.max(arr[i+1][1], arr[i+1][2]);
			arr[i][1]+=Integer.max(arr[i+1][0], arr[i+1][2]);
			arr[i][2]+=Integer.max(arr[i+1][0], arr[i+1][1]);
		}
		out.println(Integer.max(arr[0][0],Integer.max(arr[0][1], arr[0][2])));
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
