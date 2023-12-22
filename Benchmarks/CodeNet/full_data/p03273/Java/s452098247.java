import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		char[][] field = new char[h][w];
		
		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
				field[i][j] = s.charAt(j);
			}
		}
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				char c = field[i][j];
				
				if(c == '.' || c == 't') {
					boolean ok = true;
					
					for(int k = j; k < w; k++) {
						if(field[i][k] == '#') ok = false;
					}
					
					for(int k = j; k >= 0; k--) {
						if(field[i][k] == '#') ok = false;
					}
					
					if(ok) {
						for(int k = j; k < w; k++) {
							field[i][k] = 't';
						}
					}
					
					ok = true;
					
					for(int k = i; k < h; k++) {
						if(field[k][j] == '#') ok = false;
					}
					
					for(int k = i; k >= 0; k--) {
						if(field[k][j] == '#') ok = false;
					}
					
					if(ok) {
						for(int k = i; k < h; k++) {
							field[k][j] = 't';
						}
					}
				}
			}
		}
		
		for(int i = 0; i < h; i++) {
			String s = "";
			for(int j = 0; j < w; j++) {
				if(field[i][j] != 't') s = s + field[i][j];
			}
			if(!s.equals("")) out.println(s);
		}
		
		out.flush();
	}
	
	public static void debug(char[][] field, int h, int w) {
		for(int i = 0; i < h; i++) {
			String s = "";
			for(int j = 0; j < w; j++) {
				if(field[i][j] != 't') s = s + field[i][j];
			}
			if(!s.equals("")) System.out.println(s);
		}
	}

	public static int gcd(int a, int b) {
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {

    public Pair(final K key, final V value) {
        super(key, value);
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