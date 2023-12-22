import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args){
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		solve(sc,out);

		out.flush();
	}

	public static void solve(FastScanner sc, PrintWriter out) {
		int n = sc.nextInt();
		
		int[] x = new int[n];
		int[] y = new int[n];
		
		List<Pair<Integer,Integer>> list = new ArrayList<Pair<Integer,Integer>>();
		
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			
			list.add(new Pair<>(x[i], y[i]));
		}
		
		list.sort((a,b) -> (b.getKey() + b.getValue()) - (a.getKey() + b.getValue()));
		
		List<Pair<Pair<Integer,Integer>, Integer>> temp = new ArrayList<Pair<Pair<Integer,Integer>, Integer>>();
		//出現回数
		
		for(int i = 1; i < n; i++) {
			Pair<Integer,Integer> pair = new Pair<>(list.get(i-1).getKey() - list.get(i).getKey(), list.get(i-1).getValue() - list.get(i).getValue());
			if(pair.getKey() == 0 || pair.getValue() == 0) continue;
			for(int j = 0; j < temp.size(); j++) {
				if(temp.get(j).getKey().getKey() == pair.getKey() && temp.get(j).getKey().getValue() == pair.getValue()) {
					temp.get(j).setValue(temp.get(j).getValue() + 1);
					continue;
				}
			}
			temp.add(new Pair<>(pair, 1));
		}
		
		
		temp.sort((a,b) -> b.getValue() - a.getValue());
		
		int a = temp.get(0).getKey().getKey();
		int b = temp.get(0).getKey().getValue();
		
		int res = 1;
		
		for(int i = 1; i < n; i++) {
			if(list.get(i).getKey() - a != list.get(i-1).getKey() || list.get(i).getValue() - b != list.get(i-1).getValue()) {
				res++;
			}
		}
		
		out.println(res/2);
		
	}

	public static long gcd(long a, long b) {
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		return gcd(b, a % b);
	}

	public static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {

    public Pair(K key, V value) {
        super(key, value);
    }

    public Pair<V, K> swap() {
    	return new Pair<V, K>(getValue(), getKey());
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