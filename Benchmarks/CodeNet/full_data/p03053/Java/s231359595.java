import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static final PrintStream out = System.out;
	Scanner sc = new Scanner(System.in);
	int H,W;
	int INF = 100010;
	List<Set<Integer>>graph;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		H = nextInt();
		W = nextInt();
		boolean f = true;
		//Set<Integer> set = new HashSet<>();
		int[][] map = new int [H][W];//# = 1
		for(int i=0;i<H;i++)Arrays.fill(map[i], INF);
		gtaphset();
		for(int i=0;i<H;i++) {
			char[] C = sc.next().toCharArray();
			for(int j=0;j<W;j++) {
				if(C[j]=='#') {
					map[i][j] = 0;
					graph.get(i).add(j);
				}
				else f = false;
			}
		}
		if(f) {out.println(0); return;}
		int max = 0;
		int t = 0;
		f = true;

		ArrayList<Set<Integer>> _graph = new ArrayList<Set<Integer>>(graph);
		gtaphset();
		//#の隣接を埋める処理
		while(f) {
			f= false;
			for(int i=0;i<H;i++) {
				for(Integer j : _graph.get(i)) {
						if(i>0) {
							if(map[i-1][j]>t+1) {
								map[i-1][j]=t+1;graph.get(i-1).add(j);
							}
						}
						if(j>0) {
							if(map[i][j-1]>t+1) {
								map[i][j-1]=t+1;graph.get(i).add(j-1);
							}
						}
						if(i<H-1) {
							if(map[i+1][j]>t+1) {
								map[i+1][j]=t+1;graph.get(i+1).add(j);
							}
						}
						if(j<W-1) {
							if(map[i][j+1]>t+1) {
								map[i][j+1]=t+1;graph.get(i).add(j+1);
							}
						}
						if(!f)f=true;
				}
			}
			t++;
			_graph = new ArrayList<Set<Integer>>(graph);
			gtaphset();
		}

		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				max=Math.max(max,map[i][j]);
			}
		}
		out.println(max);
	}

	private void gtaphset() {
		graph = new ArrayList<Set<Integer>>();
		for(int i=0;i<H;i++) {
			graph.add(new HashSet<Integer>());
		}

	}

	private int min(int a, int b) {
		return Math.min(a, b);
	}

	private int nextInt() {
		return Integer.parseInt(next());
	}
	private long nextLong() {
		return Long.parseLong(next());
	}
	private String next() {
		return sc.next();
	}

}