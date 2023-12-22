import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.LinkedList;
public class Main {
	public static class Pair {
		int i;
		int j;
		public Pair(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}
	public static void main(String args[]) {
		Sc sc = new Sc(System.in);
		int H = sc.nI();
		int W = sc.nI();
		String b[] = new String[H];
		for(int i = 0; i<H; i++) {
			b[i] = sc.n();
		}
		Pair[][] prev = new Pair[H][W];
		LinkedList<Pair> active = new LinkedList<>();
		Pair start = null;
		for(int i = 0; i<H; i++) {
			for(int j = 0; j<W; j++) {
				if(b[i].charAt(j) == '#') {
					start = new Pair(i,j);
					active.add(start);
					prev[i][j] = start;
					break;
				}
			}
			if(active.size() != 0) break;
		}
		while(!active.isEmpty()) {
			Pair p = active.poll();
			if(b[p.i].charAt(p.j) == '#') active.addAll(dfs(p, prev, b));
			else {
				if(p.i>0) {
					if(prev[p.i-1][p.j] == null) {
						prev[p.i-1][p.j] = p;
						active.addLast(new Pair(p.i-1,p.j));
					}
				}
				if(p.j>0) {
					if(prev[p.i][p.j-1] == null) {
						prev[p.i][p.j-1] = p;
						active.addLast(new Pair(p.i,p.j-1));
					}
				}
				if(p.i<H-1) {
					if(prev[p.i+1][p.j] == null) {
						prev[p.i+1][p.j] = p;
						active.addLast(new Pair(p.i+1,p.j));
					}
				}
				if(p.j<W-1) {
					if(prev[p.i][p.j+1] == null) {
						prev[p.i][p.j+1] = p;
						active.addLast(new Pair(p.i,p.j+1));
					}
				}
			}
		}
		boolean[][] min = new boolean[H][W];
		for(int i = 0; i<H; i++) {
			for(int j = 0; j<W; j++) {
				if(b[i].charAt(j) == '#') {
					if(!min[i][j]) {
						add(i,j,min,prev);
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<H; i++) {
			for(int j = 0; j<W; j++) {
				if(min[i][j]) sb.append('#');
				else sb.append('.');
			}
			sb.append('\n');
		}
		sb.append('\n');
		boolean[][] max = new boolean[H][W];
		for(int i = 0; i<H; i++) {
			for(int j = 0; j<W; j++) {
				if(!min[i][j] || b[i].charAt(j) == '#') max[i][j] = true;
			}
		}
		boolean[][] visited = new boolean[H][W];
		dfs(start.i,start.j,max,visited,H,W);
		for(int i = 0; i<H; i++) {
			for(int j = 0; j<W; j++) {
				if(visited[i][j]) sb.append('#');
				else sb.append('.');
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
	public static void dfs(int i, int j, boolean[][] max, boolean visited[][], int H, int W) {
		visited[i][j] = true;
		int ni = i-1;
		int nj = j;
		if(ni>=0 && max[ni][nj] && !visited[ni][nj]) dfs(ni,nj,max,visited,H,W);
		ni = i+1;
		if(ni<H && max[ni][nj] && !visited[ni][nj]) dfs(ni,nj,max,visited,H,W);
		ni = i;
		nj = j-1;
		if(nj>=0 && max[ni][nj] && !visited[ni][nj]) dfs(ni,nj,max,visited,H,W);
		nj = j + 1;
		if(nj<W && max[ni][nj] && !visited[ni][nj]) dfs(ni,nj,max,visited,H,W);
	}

	public static void add(int i, int j, boolean[][] min, Pair[][] prev) {
		min[i][j] = true;
		if(!min[prev[i][j].i][prev[i][j].j]) add(prev[i][j].i,prev[i][j].j,min,prev);
	}
	public static LinkedList<Pair> dfs(Pair p, Pair[][] prev, String[] b) {
		LinkedList<Pair> ret = new LinkedList<>();
		if(p.i>0) {
			if(prev[p.i-1][p.j] == null) {
				prev[p.i-1][p.j] = p;
				if(b[p.i-1].charAt(p.j) == '#')  ret.addAll(dfs(new Pair(p.i-1,p.j),prev,b));
				else {
					ret.add(new Pair(p.i-1,p.j));
				}
			}
		}
		if(p.j>0) {
			if(prev[p.i][p.j-1] == null) {
				prev[p.i][p.j-1] = p;
				if(b[p.i].charAt(p.j-1) == '#')  ret.addAll(dfs(new Pair(p.i,p.j-1),prev,b));
				else {
					ret.add(new Pair(p.i,p.j-1));
				}
			}
		}
		if(p.i<b.length-1) {
			if(prev[p.i+1][p.j] == null) {
				prev[p.i+1][p.j] = p;
				if(b[p.i+1].charAt(p.j) == '#')  ret.addAll(dfs(new Pair(p.i+1,p.j),prev,b));
				else {
					ret.add(new Pair(p.i+1,p.j));
				}
			}
		}
		if(p.j<b[0].length()-1) {
			if(prev[p.i][p.j+1] == null) {
				prev[p.i][p.j+1] = p;
				if(b[p.i].charAt(p.j+1) == '#')  ret.addAll(dfs(new Pair(p.i,p.j+1),prev,b));
				else {
					ret.add(new Pair(p.i,p.j+1));
				}
			}
		}
		return ret;
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