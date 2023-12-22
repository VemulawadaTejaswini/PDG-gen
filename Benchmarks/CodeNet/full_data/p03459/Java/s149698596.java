import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	static class Scanner{
		BufferedReader br=null;
		StringTokenizer tk=null;
		public Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() throws IOException{
			while(tk==null || !tk.hasMoreTokens()) {
				String cad = br.readLine();
				if (cad == null)
					return null;
				tk=new StringTokenizer(cad);
			}
			return tk.nextToken();
		}
		public int nextInt() throws NumberFormatException, IOException{
			return Integer.valueOf(next());
		}
		public long nextLong() throws NumberFormatException, IOException{
			return Long.valueOf(next());
		}
		public double nextDouble() throws NumberFormatException, IOException{
			return Double.valueOf(next());
		}
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		int c_t = 0;
		int old_x = 0;
		int old_y = 0;
		for(int i = 0; i < N; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int diff = Math.abs(x - old_x) + Math.abs(y - old_y);
			int time_diff = t - c_t;
			if (time_diff < diff) {
				System.out.println("No");
				return;
			}
			else {
				int offset = time_diff - diff;
				if (offset % 2 != 0) {
					System.out.println("No");
					return;
				}
			}
			old_x = x;
			old_y = y;
			c_t = t;
		}
		System.out.println("Yes");
	}

}
