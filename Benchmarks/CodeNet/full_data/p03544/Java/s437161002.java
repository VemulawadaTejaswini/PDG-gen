import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

    final static boolean fileIO = false;
    final static boolean DEBUG = false;
    final static String input = "input.txt";
    final static String output = "output.txt";
    
    public static void main(String args[]) throws Exception {

		InputStream is = null;
		OutputStream os = null;
		if (fileIO) {
			is = new FileInputStream("input.txt");
			os = new FileOutputStream("output.txt");
		} else {
			is = System.in;
			os = System.out;
		}
		InputReader in = new InputReader(is);
		PrintWriter out = new PrintWriter(os);
		new Task_B().solve(in, out);
		out.close();	

	}

static class Task_A {
	
	public void solve(InputReader in, PrintWriter out) {
		char a[] = in.nextString("\n").toCharArray();
		boolean ans = false;
		if ((a[0] == a[1] && a[1] == a[2]) || (a[1] == a[2] && a[2] == a[3])){
			ans = true;
		}
		out.println(ans ? "Yes" : "No");
	}
}

static class Task_B {
		
	public void solve(InputReader in, PrintWriter out) {
		int n = in.nextInt();
		BigInteger pre1 = BigInteger.ONE;
		BigInteger pre2 = BigInteger.valueOf(2);
		BigInteger cur = BigInteger.valueOf(2);
		for (int i = 2; i <= n; ++i) {
			cur = pre1.add(pre2);
			pre2 = pre1;
			pre1 = cur;
		}
		out.println(cur);
	}
}


static class InputReader {
	
	private StringTokenizer tokenizer;
	private BufferedReader reader;

	public InputReader(InputStream is) {
		tokenizer = null;
		reader = new BufferedReader(new InputStreamReader(is), 32768);
	}

	public String nextString(String delim) {
		String ans = null;
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				String line = reader.readLine();
				if (line != null) {
					tokenizer = new StringTokenizer(line, delim);
					ans = tokenizer.nextToken();
				} else {
					ans = null;
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		} else {
			ans = tokenizer.nextToken();
		}
		return ans;
	}
	
	public Integer nextInt() {
		return Integer.parseInt(nextString(" "));		
	}
}
}


