import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main  implements Runnable {
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
    }
    public void run() {
    	FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int[] an = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			an[i] = 0; 
			for (int j = 0; j < i; j++) {
				if(a[i] < a[j])
				{
					an[i]++;
				}
			}
		}
		int[] at = new int[n];
		for (int i = 0; i < n; i++) {
			at[i] = 0;
			for (int j = 0; j < n; j++) {
				if(a[i] < a[j])
				{
					at[i]++;
				}
			}
		}

		long anst = 0;
		for (int i = 0; i < n; i++) {
			anst += at[i];
		}
		long ansn = 0;
		for (int i = 0; i < n; i++) {
			ansn += an[i];
		}
		long ans = 0;
		long kp = ((long)(k-1)*((long)k))/2l;
		kp = kp % 1000000007l;
		//for (int i = 1; i <= k; i++) {
		//	ans += anst*((long)i-1l);
		//	ans += ansn;
		//	ans = ans % 1000000007l;
		//}
		ans += kp*anst;
		ans = ans % 1000000007l;
		ans += k*ansn;
		ans = ans % 1000000007l;
		out.printf("%d\n", ans);
		out.println();
		out.flush();
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
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }
    }
}