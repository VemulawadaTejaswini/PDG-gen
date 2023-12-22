import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;




public class Main{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		HashSet<Character>  a = new HashSet<Character>();
		int n = 0;
		char one = 'n';
		char two = 'n';
		boolean onea = false;
		boolean twoa = false;
		String string = sc.next();
		
		for (int i = 0; i < 4; i++) {
			if (one == 'n') {
				one = string.charAt(i);
			}
			else {
				if (two == 'n' && string.charAt(i) != one) {
					two = string.charAt(i);
				}
				
				if (one == string.charAt(i)) {
					onea = true;
				}
				if (two == string.charAt(i)) {
					twoa = true;
				}
			}
		}
		
		if (onea && twoa) {
			out.println("Yes");
		}
		else {
			out.println("No");
		}
		
		
		out.flush();

	}
	

	
	

	
}
class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public char nextChar() throws IOException {
		return next().charAt(0);
	}

	public Long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public boolean ready() throws IOException {
		return br.ready();
	}

	public void waitForInput() throws InterruptedException {
		Thread.sleep(3000);
	}


}