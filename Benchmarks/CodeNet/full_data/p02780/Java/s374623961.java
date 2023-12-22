import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.StringTokenizer;


//System.out.println();
public class Main implements Runnable { //クラス名はMain

    public static void main(String[] args) {
    	Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        HashMap<Integer,Integer> has = new HashMap<Integer,Integer>();
        //大量の検索はHashSetの方が早い
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=1; i<=n; i++) {
        	int pi = sc.nextInt();
        	a.add(pi);
        	if(i >= k) {
        		int to = 0;
        		for (int ki=1;ki<=k;ki++) {
        			to += a.get(i-ki);
        		}
        		has.put(i,to);
        	}
        }

        List<Entry<Integer,Integer>> list_entrys = new ArrayList<Entry<Integer,Integer>>(has.entrySet());
        Collections.sort(list_entrys, new Comparator<Entry<Integer, Integer>>() {
            //compareを使用して値を比較する
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2)
            {
                //降順
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });


        int wh =0;
        for(Entry<Integer, Integer> entry : list_entrys) {
        	wh =entry.getKey();
        	break;
        }

        double result=0;
        for (int ki=1; ki <= k; ki++) {
			double ea = a.get(wh-ki);
			double val = 0;
			for (int di=1;di<=ea;di++) {
				val += 1/ea * di;
			}
			result += val;
		}

        System.out.println(result);
    }
}


//高速なScanner
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
