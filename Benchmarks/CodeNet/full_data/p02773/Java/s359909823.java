import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		int n = sc.nextInt();
		List<String> list = new ArrayList<>();

		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}

		List<String> list2 = new ArrayList<String>(new HashSet<>(list));

		int cnt[] = new int[list2.size()];

		Collections.sort(list2);

		for(int i=0;i<list2.size();i++) {
			for(int j=0;j<n;j++) {
				if(list2.get(i).equals(list.get(j))) {
					cnt[i] += 1;
				}
			}
		}

		int max = cnt[0];
		for(int i=1;i<cnt.length;i++) {
			if(max < cnt[i]) {
				max = cnt[i];
			}
		}
		
		
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i] == max) System.out.println(list2.get(i));
		}

	}

	static class FastScanner {
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
                a[i] = (int) nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

}
