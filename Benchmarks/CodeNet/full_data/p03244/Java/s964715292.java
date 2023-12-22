import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		solve(sc, out);

		out.flush();
	}

	public static void solve(FastScanner sc, PrintWriter out) {
		int n = sc.nextInt();
		
		int[] v = sc.nextIntArray(n);
		
		HashMap<Integer, Integer> g = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i+=2) {
			if(g.containsKey(v[i])) g.replace(v[i], g.get(v[i])+1); else g.put(v[i], 1);
		}
		
		HashMap<Integer, Integer> k = new HashMap<Integer, Integer>();
		
		for(int i = 1; i < n; i+=2) {
			if(k.containsKey(v[i])) k.replace(v[i], k.get(v[i])+1); else k.put(v[i], 1);
		}
		
		int res = 0;

		if(g.entrySet().stream().findFirst().get().getValue() != n/2) {
			res+=(n/2)- (g.entrySet().stream().map(x->x.getValue().intValue()).max(Comparator.naturalOrder()).get());
		}
		
		if((k.entrySet().stream().findFirst().get().getValue() != n/2 || k.entrySet().stream().findFirst().get().getValue() == g.entrySet().stream().findFirst().get().getValue())  && res != k.entrySet().stream().map(x->x.getValue().intValue()).max(Comparator.naturalOrder()).get()){
			
			if(k.entrySet().stream().findFirst().get().getValue() == n/2 && k.entrySet().stream().findFirst().get().getKey() != g.entrySet().stream().findFirst().get().getKey()) {
				out.println(res);
				return;
			}
			
			if(k.entrySet().stream().map(x->x.getValue().intValue()).max(Comparator.naturalOrder()).get() == g.entrySet().stream().map(x->x.getValue().intValue()).max(Comparator.naturalOrder()).get()) {
				List<Integer> sorted = k.entrySet().stream().map(x -> x.getValue()).sorted().collect(Collectors.toList());
				if(sorted.size() == 1) {
					res+=n/2;
				}else{
					res+=(n/2) - sorted.get(sorted.size()-2);
				}
			}else{
				res+=(n/2) - k.entrySet().stream().map(x->x.getValue().intValue()).max(Comparator.naturalOrder()).get();
			}
		}
		
		out.println(res);
		
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