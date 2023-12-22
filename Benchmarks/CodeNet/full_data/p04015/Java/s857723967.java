import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.TreeSet;
public class Main {
	public static class Col implements Comparable<Col>{
		int sum;
		int cards;
		long amount;
		public Col (int sum, int cards, long amount) {
			this.sum = sum;
			this.cards = cards;
			this.amount = amount;
		}
		public int compareTo(Col c) {
			if(sum != c.sum) return sum - c.sum;
			if(cards != c.cards) return cards - c.cards;
			return 0;
		}
	}
	public static void main(String args[]) {
		Sc sc = new Sc(System.in);
		int N = sc.nI();
		int A = sc.nI();
		int [] x = new int[N];
		for(int i = 0; i<N; i++) {
			x[i] = sc.nI();
		}
		TreeSet<Col> set = new TreeSet<>();
		Col newc = new Col(0,0,1);
		set.add(newc);
		for(int i = 0; i<N; i++) {
			TreeSet<Col> newset = new TreeSet<>();
			for(Col c : set) {
				Col nc = new Col(c.sum + x[i],c.cards+1,c.amount);
				Col contains = newset.ceiling(nc);
				if(contains != null && nc.compareTo(contains) == 0) {
					contains.amount += nc.amount;
				} else {
					newset.add(nc);
				}
				contains = newset.ceiling(c);
				if(contains != null && c.compareTo(contains) == 0) {
					contains.amount += c.amount;
				} else {
					newset.add(c);
				}
			}
			set = newset;
		}
		long amount = 0;
		for(int i = 1; i<=N; i++) {
			Col nc = new Col(A*i,i,0);
			Col contains = set.ceiling(nc);
			if(contains != null && nc.compareTo(contains) == 0) 
				amount += contains.amount;
		}
		System.out.println(amount);
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