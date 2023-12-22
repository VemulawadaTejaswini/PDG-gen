import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static PrintWriter out;

	static HashMap<Integer, Integer> happyC;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);

		int n = sc.nextInt();
		boolean eq = true;
		int f = sc.nextInt();
		boolean odd = false;
		int temp = 0;
		if(f%2 !=0)
			odd = true;
		
		for (int i = 1; i < n; i++) {
			int curr = sc.nextInt();
			temp = curr;
			if(curr%2 != 0)
				odd = true;
			
			if(eq) {
				if(curr != f)
					eq = false;
			}
			f = curr;
		}
		if(eq)
			out.println(temp);
		else {
			if(odd)
				out.println(1);
			else
				out.println(2);
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
