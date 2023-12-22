import java.io.*;
import java.util.*;

/******************************\
 * The solution is at the top *
 *                            *
 *   Created by : azhar556    *
\******************************/

public class Main {
	static long Gcd (long c, long d) {
		return c == 0 ? d : Gcd(d % c , c);
	}
	static long Lcm (long c, long d) {
		return c * d / Gcd(c, d);
	}
    static void solve() {
		long A = nl();
		long B = nl();
		long C = nl();
		long D = nl();
		long LcmCD = Lcm(C, D);
		long tot = B - A + 1;
		
		long divC = A / C;
		if (A % C != 0) divC++;
		if (B - (C * divC) >= 0) tot -= (B - (C * divC)) / C + 1;
		err.println(tot);
		
		long divD = A / D;
		if (A % D != 0) divD++;
		if (B - (D * divD) >= 0) tot -= (B - (D * divD)) / D + 1;
		err.println(tot + " " + LcmCD);
		
		long divCD = A / LcmCD;
		if (A % LcmCD != 0) divCD++;
		if (B - (LcmCD * divCD) >= 0) tot += (B - (LcmCD * divCD)) / LcmCD + 1;
		out.println(tot);
    }    

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int t;// = ni();
        t = 1;
        while (t-- > 0) solve(); 
        err.println("Time elapsed : " + (System.currentTimeMillis() - time) / 1000F + " s.");
        err.close(); out.close();
    }

	static int[] radixSort(int[] f){ return radixSort(f, f.length); }
	static int[] radixSort(int[] f, int n)
	{
		int[] to = new int[n];
		{
			int[] b = new int[65537];
			for(int i = 0;i < n;i++)b[1+(f[i]&0xffff)]++;
			for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
			for(int i = 0;i < n;i++)to[b[f[i]&0xffff]++] = f[i];
			int[] d = f; f = to;to = d;
		}
		{
			int[] b = new int[65537];
			for(int i = 0;i < n;i++)b[1+(f[i]>>>16)]++;
			for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
			for(int i = 0;i < n;i++)to[b[f[i]>>>16]++] = f[i];
			int[] d = f; f = to;to = d;
		}
		return f;
	}

    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static PrintWriter err = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.err)));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer token;
    
    static boolean hasMoreTokens () {
        String sample = null;
		try {
			sample = br.readLine();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return sample == null ? false : true;
    }

    static String ns() {
        while (token == null || !token.hasMoreTokens()) {
            try {
                token = new StringTokenizer(br.readLine());
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return token.nextToken();
    }
    static char nc() {
        return Character.valueOf(ns().charAt(0));
    }
    static int ni() {
        return Integer.parseInt(ns());
    }
    static double nd() {
        return Double.parseDouble(ns());
    }
    static long nl() {
        return Long.parseLong(ns());
    }
}
// Collections Arrays Math
// Vector HashSet TreeSet HashMap TreeMap ArrayDeque 