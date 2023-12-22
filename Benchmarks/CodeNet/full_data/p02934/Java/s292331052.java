import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Kattio in = new Kattio(System.in);
        int n = in.nextInt();
        
        double sum = 0;
        for (int i = 0; i < n; ++i) {
            double x = in.nextInt() * 1.0;
            sum += 1/x;
        }

        in.println(1 / sum);

        in.close();
        in.flush();
    }


}


class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
	super(new BufferedOutputStream(System.out));
	r = new BufferedReader(new InputStreamReader(i));
    }
    public Kattio(InputStream i, OutputStream o) {
	super(new BufferedOutputStream(o));
	r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
	return peekToken() != null;
    }

    public int getInt() {
	return Integer.parseInt(nextToken());
    }

    public double getDouble() { 
	return Double.parseDouble(nextToken());
    }

    public long getLong() {
	return Long.parseLong(nextToken());
    }

    public String getWord() {
	return nextToken();
    }



    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
	if (token == null) 
	    try {
		while (st == null || !st.hasMoreTokens()) {
		    line = r.readLine();
		    if (line == null) return null;
		    st = new StringTokenizer(line);
		}
		token = st.nextToken();
	    } catch (IOException e) { }
	return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }

    public int nextInt() {
        return Integer.parseInt(getWord());
    }

}