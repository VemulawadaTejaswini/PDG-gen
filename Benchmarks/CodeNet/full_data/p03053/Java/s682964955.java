import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static char[][] field;

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		field = new char[h][w];

		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
				field[i][j] = s.charAt(j);
			}
		}

		int count = 0;
		
		if(h==1&&w==1) {
			System.out.println(0);
			return;
		}

		loop: while(true) {
			count++;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w;j++) {
					if(field[i][j] == '#') {
						try {
							if(field[i+1][j] == '.') field[i+1][j] = 't';
						}catch(Exception e) {

						}
						try {
							if(field[i-1][j] == '.') 	field[i-1][j] = 't';
						}catch(Exception e) {

						}
						try {
							if(field[i][j-1] == '.') 						field[i][j-1] = 't';
						}catch(Exception e) {

						}
						try {
							if(field[i][j+1] == '.') field[i][j+1] = 't';
						}catch(Exception e) {

						}

					}
				}
			}

			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w;j++) {
					if(field[i][j] == 't') field[i][j] = '#';
				}
			}

			if(isallblack()) break loop;

		}
		System.out.println(count);

	}

	public static boolean isallblack() {
		for(char[] c : field) {
			for(char ch : c) {
				if(ch != '#') {
					return false;
				}
			}
		}
		return true;
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