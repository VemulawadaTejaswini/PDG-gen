import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
	private static class Pair implements Comparable<Pair> {
		long v;
		long red;
		int a;
		boolean cube;
		public Pair(long v) {
			this.v = v;
			long cbr = (long)Math.cbrt(v);
			cube = (cbr*cbr*cbr == v);
			a = cube ? 0 : 1;
			red = cube ? -1 : reduce(v);
		}
		public int compareTo(Pair p) {
			return p.a-a;
		}
	}
	public static void main(String args[]) {
		Sc sc = new Sc(System.in);
		int n = sc.nI();
		HashMap<Long,Pair> map = new HashMap<>();
		ArrayList<Pair> pairs = new ArrayList<>();
		for(int i = 0; i<n; i++) {
			long v = sc.nL();
			if(map.containsKey(v)) {
				Pair p = map.get(v);
				if(!p.cube) p.a++;
			} else {
				Pair p = new Pair(v);
				map.put(v,p);
				pairs.add(p);
			}
		}
		Collections.sort(pairs);
		HashSet<Long> set = new HashSet<>();
		int picked = 0;
		for(Pair p:pairs) {
			long sqrt = (long)Math.sqrt(p.v);
			boolean isc = p.cube;
			if(!set.contains(p.red)) {
				if(!isc) {
					picked+=p.a;
					set.add(inv(p.v));
				} else {
					picked++;
					break;
				}
			}
		}
		System.out.println(picked);

	}
	public static long inv(long v) {
		long ret = 1;
		if(v%4 == 0) {
			ret = 2;
		} else if(v%2 == 0) {
			ret = 4;
		}
		for(long i = 3; i*i<=v; i+=2) {
			long sq = i*i;
			if(v%sq == 0) {
				ret *= i;
				v /= sq;
			} else if(v%i == 0) {
				ret *= sq;
				v /= i;
			}
		}
		return ret;
	}
	public static long reduce(long v) {
		while(v%8 == 0) {
			v /= 8;
		}
		for(long i = 3; i*i*i<=v; i+=2) {
			long cube = i*i*i;
			while(v%cube == 0) {
				v /= cube;
			}
		}
		return v;
	}
}
class Sc {
    public Sc(InputStream i) {
        r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasM() {
        return peekToken() != null;
    }

    public int nI() {
        return Integer.parseInt(nextToken());
    }

    public double nD() { 
        return Double.parseDouble(nextToken());
    }

    public long nL() {
        return Long.parseLong(nextToken());
    }

    public String n() {
        return nextToken();
    }

    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
        if (token == null) 
            try {
                while (st == null || !st.hasMoreTokens()) {
                    line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                token = st.nextToken();
            } catch (IOException e) { }
        return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }
}