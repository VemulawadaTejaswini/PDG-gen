import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
    	int H = ni();
    	int W = ni();

    	String[] S = nsa(H);

    	if (S[0].indexOf('X') != -1 || S[0].indexOf('X') != -1) {
    		out.println(-1);
    		return;
    	}

    	for (int i=0; i<H; i++) {
    		if (S[i].charAt(0) == 'X' || S[i].charAt(W-1) == 'X') {
        		out.println(-1);
        		return;
        	}
    	}

    	boolean[][] used = new boolean[H][W];

    	List<Pair> list = new ArrayList<>();

    	for (int i=0; i<H; i++) {
    		for (int j=0; j<W; j++) {
    			if (S[i].charAt(j) == 'X') {
        			list.add(new Pair(i, j));
        			used[i][j] = true;
    			}
    		}
    	}

    	int ans = 0;

    	for (int i=0; i<list.size(); i++) {
    		int h = list.get(i).x;
    		int w = list.get(i).y;
    		if (!used[h - 1][w]) {
    			ans++;
    			used[h - 1][w] = true;
    		}
    		if (!used[h + 1][w]) {
    			ans++;
    			used[h + 1][w] = true;
    		}
    		if (!used[h][w - 1]) {
    			ans++;
    			used[h][w - 1] = true;
    		}
    		if (!used[h][w + 1]) {
    			ans++;
    			used[h][w + 1] = true;
    		}
    	}

    	for (int i=1; i<H-1; i++) {
    		for (int j=1; j<W-1; j++) {
    			boolean flg1 = false;
    			boolean flg2 = false;
    			boolean flg3 = false;
    			boolean flg4 = false;
    			for (int k=i-1; k>=0; k--) {
    				if (used[k][j]) {
    					flg1 = true;
    					break;
    				}
    			}
    			for (int k=i+1; k<H; k++) {
    				if (used[k][j]) {
    					flg2 = true;
    					break;
    				}
    			}
    			for (int k=j-1; k>=0; k--) {
    				if (used[i][k]) {
    					flg3 = true;
    					break;
    				}
    			}
    			for (int k=j+1; k<W; k++) {
    				if (used[i][k]) {
    					flg4 = true;
    					break;
    				}
    			}
    			if (flg1 && flg2 && flg3 && flg4) {
    				ans--;
    			}
    		}
    	}

    	ans += list.size();

    	out.println(ans);
    }

    public class Pair implements Comparable<Pair> {
		int x, y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int compareTo(Pair p) {
			return x == p.x ? y - p.y : x - p.x;
		}
	}

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}
