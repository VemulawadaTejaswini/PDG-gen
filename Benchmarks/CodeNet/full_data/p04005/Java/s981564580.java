import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

    int[] a;

    void solve() {
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();

    	int max = Math.max(Math.max(A,B),C);

	BigInteger bA = BigInteger.valueOf(A);
	BigInteger bB = BigInteger.valueOf(B);
	BigInteger bC = BigInteger.valueOf(C);
	BigInteger tmp = bA.multiply(bB).multiply(bC);

    	BigInteger tmp2 = tmp.divide(BigInteger.valueOf(max));

    	if (tmp.remainder(BigInteger.valueOf(2)) == BigInteger.valueOf(0)) {
	    System.out.println(0);
    	} else {
	    System.out.println(tmp2);
    	}

    }

    void print(int[] a) {
    	out.print(a[0]);
    	for (int i = 1; i < a.length; i++) out.print(" " + a[i]);
    	out.println();
    }

    public static void main(String[] args) throws Exception {
    	new Main().run();
    }

    MyScanner sc = null;
    PrintWriter out = null;
    public void run() throws Exception {
    	sc = new MyScanner(System.in);
    	out = new PrintWriter(System.out);
    	for (;sc.hasNext();) {
    	    solve();
    	    out.flush();
    	}
    	out.close();
    }

    class MyScanner {
    	String line;
    	BufferedReader reader;
    	StringTokenizer tokenizer;

    	public MyScanner(InputStream stream) {
    	    reader = new BufferedReader(new InputStreamReader(stream));
    	    tokenizer = null;
    	}
    	public void eat() {
    	    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
    		try {
    		    line = reader.readLine();
    		    if (line == null) {
    			tokenizer = null;
    			return;
    		    }
    		    tokenizer = new StringTokenizer(line);
    		} catch (IOException e) {
    		    throw new RuntimeException(e);
    		}
    	    }
    	}
    	public String next() {
    	    eat();
    	    return tokenizer.nextToken();
    	}
    	public String nextLine() {
    	    try {
    		return reader.readLine();
    	    } catch (IOException e) {
    		throw new RuntimeException(e);
    	    }
    	}
    	public boolean hasNext() {
    	    eat();
    	    return (tokenizer != null && tokenizer.hasMoreElements());
    	}
    	public int nextInt() {
    	    return Integer.parseInt(next());
    	}
    	public long nextLong() {
    	    return Long.parseLong(next());
    	}
    	public double nextDouble() {
    	    return Double.parseDouble(next());
    	}
    	public int[] nextIntArray(int n) {
    	    int[] a = new int[n];
    	    for (int i = 0; i < n; i++) a[i] = nextInt();
    	    return a;
    	}
    }
}
