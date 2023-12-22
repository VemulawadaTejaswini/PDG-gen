//--- pA ---//
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Reader reader;
	public Solution () {
		reader = new Reader();
		while (reader.hasNext()) {
			run_case();
		}
	}

	int[] dir_row = new int[]{1, 0};
	int[] dir_col = new int[]{0, 1};
	int inf = (int)1e9;
	int row, col;
	int res;
	char[][] grid;
	int[][] mem;
	private void run_case() {
		row = reader.ni();
		col = reader.ni();
		grid = new char[row][col];
		for (int i=0; i<row; i++) grid[i] = reader.ns().toCharArray();

		Graph g = new Graph(row * col + 5);
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				int u = getIdx(i, j);
				for (int k=0; k<dir_row.length; k++) {
					int tr = i + dir_row[k];
					int tc = j + dir_col[k];
					if (tr < 0 || tc < 0 || tr >= row || tc >= col) continue;
					int v = getIdx(tr, tc);
					if (grid[tr][tc] == '#') {
						g.addEdge(u, v, 1);
					} else {
						g.addEdge(u, v, 0);
					}
				}
			}
		}

		int tar_idx = getIdx(row-1, col-1);
		g.dijkstra(0);
		int res = (int)g.dist[tar_idx];

		if (grid[0][0] == '#') {
			System.out.println(res + 1);
		} else {
			System.out.println(res);
		}

		return;
	}
	private int getIdx(int r, int c) {
		return r * col + c;
	}


}


class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			if (!st.hasMoreTokens() && !br.ready()) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public int ni() {return Integer.parseInt(this.next());}
	public String ns() {return this.next();}
}

class Graph {
    Map<Integer, Map<Integer,Integer>> adj;
    int N;

    // Dijkstra
    long inf = Long.MAX_VALUE;
    public long[] dist;
	public int[] pv;

    public Graph(int N) {
        this.N = N;

        // Graph
        adj = new HashMap<>();

        // Dijkstra
        dist = new long[N];
        Arrays.fill(dist, inf);
		pv = new int[N];
        Arrays.fill(pv, -1);
    }

    public void initDist() {
        Arrays.fill(dist, inf);
		Arrays.fill(pv, -1);
    }

    public void addEdge(int src, int des, int dist) {
        adj.putIfAbsent(src, new HashMap<>());
        adj.get(src).put(des, dist);
    }

    public void removeEdge(int src, int des) {
        if (adj.containsKey(src) && adj.get(src).containsKey(des)) {
            adj.get(src).remove(des);
        }
    }

	// ----- Dijkstra ----- //
    public void dijkstra(int src) {
        Queue<DijkstraState> pq = new PriorityQueue<>();
        pq.offer(new DijkstraState(src, 0));
		dist[src] = 0;
        while(!pq.isEmpty()){
            DijkstraState cur = pq.poll();
            int u = cur.node;
            if (adj.containsKey(u)) {
                for (int next : adj.get(u).keySet()) {
                    int v = next;
                    int weight = adj.get(u).get(next);
                    if (dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
						pv[v] = u;
                        pq.offer(new DijkstraState(v, dist[v]));
                    }
                }
            }
        }

        return;
    }

	public List<Integer> getShortestPath(int src, int dst) {
		if (dist[src] != 0) {
			System.out.println("src dist isn't 0 !");
			return null;
		}
		if (dist[dst] == inf) {
			return new ArrayList<Integer>(Arrays.asList(-1));
		}

		int t = dst;
		Stack<Integer> path = new Stack<Integer>();
		path.push(dst);
		while (pv[t] != -1) {
			path.push(pv[t]);
			t = pv[t];
		}

		List<Integer> res = new ArrayList<>();
		// System.out.println("src = " + src + ", dst = " + dst + ", path is :");
		for (; !path.isEmpty();) {
			// System.out.print(path.pop() + " ");
			res.add(path.pop());
		}

		return res;
	}

    public void PrintResult(int src) {
        for (int i=0; i<N; i++) {
            System.out.println(src + " to " + i + " : " + dist[i]);
        }
        return;
    }
}
class DijkstraState implements Comparable<DijkstraState>{
    public int node;
	public long dist;
    public DijkstraState(int node, long dist) {
        this.node = node;
        this.dist = dist;
    }
    public int compareTo(DijkstraState s) {
		// return this.dist - s.dist
		if (this.dist > s.dist) return 1;
		else if (this.dist == s.dist) return 0;
		else return -1;
    }
}
