import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	int [] ans_ar; 
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 32 * 1024 * 1024).start(); //
	}
	public void run() {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());

		int m = (int)Math.pow(2,n);
		int[] a = new int[m];
		int va = 0;
		for (int i = 0; i < m; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		Arrays.parallelSort(a);
		int p = -1;
		int cr = 0;
		int[] b = new int[m];
		for (int i = m-1; i >= 0; i--) {
			if(cr != a[i])
			{
				cr = a[i];
				p++;
				b[p] = 1;
			}
			else {
				b[p]++;
			}
		}
		String ans = "Yes";
		int cp = 0;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(0);
		for (int i = 0; i < n; i++) {
			cp = ar.size();
			for (int k = 0; k < cp; k++) {
				int j = ar.get(k);
				ar.add(clc(j,b));
			}

		}
		b[0]--;
		for (int i = 0; i < m; i++) {
			if(b[i] != 0)
			{
				ans = "No";
			}
		}
		out.println(ans);
		out.flush();
	}

	int clc (int i, int[] b)
	{
		for (int j = i+1; j < b.length; j++) {
			if(b[j] > 0)
			{
				b[j]--;
				return j;
			}
		}
		return b.length-1;
	}


    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
        public FastScanner(String in) {
        	StringReader sr = new StringReader(in);
            reader = new BufferedReader(new BufferedReader(sr));
            tokenizer = null;
        }
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
    }
}