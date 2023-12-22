import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args){
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int out = 0;
		int min = 2020;
		boolean flg3 = false;
		boolean flg673 = false;
		if (m-n < 2019) {

			for (int i=n;i<=m;i++) {
				if (i%3 == 0) {
					flg3 = true;
				} else if (i%673 == 0) {
					flg673 = true;
				}
				int mod = i%2019;
				if (min == mod) {
					out = min * min;
				} else {
					min = Math.min(min, mod);
					out = min * (min+1);
				}

			}

		}
		System.out.println(flg3 && flg673 ? 0:out);

	}

}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

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

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
     }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }
}