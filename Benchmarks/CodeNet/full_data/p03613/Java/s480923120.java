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
		int[] c = new int[100000 + 5];
		for(int i = 0; i < N; i++) {
			int n = sc.nextInt();
			c[n - 1 + 1]++;
			c[n + 0 + 1]++;
			c[n + 1 + 1]++;
		}
		int max = 0;
		int number = -1;
		for(int i = 0; i < c.length; i++)
			if (c[i] > max) {
				max = c[i];
				number = i - 1;
			}
		System.out.println(max);
		
	}

}
