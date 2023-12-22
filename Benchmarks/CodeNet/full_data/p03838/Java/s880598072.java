import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
    static int MOD = 1000000007;

    void solve() throws IOException {

    	int x = ni();
    	int y = ni();

    	boolean a = true;
    	boolean b = true;

    	if(x < 0) a = false;
    	if(y < 0) b = false;

    	int xa = Math.abs(x);
    	int ya = Math.abs(y);

    	long ans = 0;

    	if(xa > ya){
    		ans = xa - ya;
    		if(a == true && b == true) ans += 2;
    		else if(a != b) ans++;
    		if(ya == 0) ans--;
    	}else if(xa < ya){
    		ans = ya - xa;
			if(a == false && b == false) ans += 2;
    		else if(a != b) ans++;
			if(ya == 0) ans--;
		}else if(xa == ya){
    		if(a != b) ans++;
		}

    	out.println(ans);

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

    int k(int n) throws IOException {
        if(n == 0) return 1;
        else return n * k(n-1);
    }

    long s(int a, int n) throws IOException {
        return (a+n) * (n-a+1) / 2;
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