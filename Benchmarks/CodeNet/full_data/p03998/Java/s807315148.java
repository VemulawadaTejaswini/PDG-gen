import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class Main {
 
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
 
    void solve() throws IOException {
    	String sa = ns();
    	String sb = ns();
    	String sc = ns();
    	
    	int turn = 0;
    	int ia = 0;
    	int ib = 0;
    	int ic = 0;
    	
    	while (true) {
    		if (turn == 0) {
    			if (ia == sa.length()) {
    				out.println("A");
    				break;
    			}
    			turn = sa.charAt(ia) - 'a';
    			ia++;
    		} else if (turn == 1) {
    			if (ib == sb.length()) {
    				out.println("B");
    				break;
    			}
    			turn = sb.charAt(ib) - 'a';
    			ib++;
    		} else {
    			if (ic == sc.length()) {
    				out.println("C");
    				break;
    			}
    			turn = sc.charAt(ic) - 'a';
    			ic++;
    		}
    	}
    }
 
    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }
 
    int ni() throws IOException {
        return Integer.parseInt(ns());
    }
 
    long nl() throws IOException {
        return Long.parseLong(ns());
    }
 
    double nd() throws IOException {
        return Double.parseDouble(ns());
    }
 
    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }
 
    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }
 
    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }
 
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}