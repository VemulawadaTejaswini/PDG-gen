import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args){
		FastScanner sc = new FastScanner(System.in);
		int N = sc.nextInt();

		Map<Integer,String> map = new LinkedHashMap<Integer, String>();
		for (int i=0;i<N;i++) {
			String s = sc.next();
			int a = sc.nextInt();
			map.put(a, s);
		}
		Map<Integer,String> result = map.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue().thenComparing(Map.Entry.<Integer,String>comparingByKey().reversed())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));



		for (Map.Entry<Integer, String> e : result.entrySet()) {
			int i = 1;
			for (Map.Entry<Integer, String> e1 : map.entrySet()) {
				if (e.equals(e1)) {
					System.out.println(i);
				}
				i++;
			}
		}

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