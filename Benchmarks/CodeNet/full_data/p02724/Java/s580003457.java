import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		FS fs = new FS();
		int n=fs.nextInt();
		int a=n/500;
		n%=500;
		int b=n/5;
		System.out.println(a*1000+b*5);
	}
	
	static class FS {
		BufferedReader br;
		StringTokenizer st;
		public FS() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try { st = new StringTokenizer(br.readLine());}
				catch(Exception e) {}
			}
			return st.nextToken();
		}
		int nextInt() {
			 return Integer.parseInt(next());
		}
	}

}