//--- pD ---//
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Scanner scanner;

	long inf = Long.MAX_VALUE;

	int[] dir_row = new int[]{0, 1, 0, -1};
	int[] dir_col = new int[]{1, 0, -1, 0};

	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		// scanner.nextLine();
		String line = scanner.nextLine();
		int row = Integer.parseInt(line.split("\\s+")[0]);
		int col = Integer.parseInt(line.split("\\s+")[1]);

		char[][] grid = new char[row][col];
		for (int i=0; i<row; i++) {
			grid[i] = scanner.nextLine().toCharArray();
		}

		// build graph
		Dijkstra dij = new Dijkstra(row * col);
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				if (grid[i][j] == '.') {
					for (int k=0; k<dir_row.length; k++) {
						int tr = i + dir_row[k];
						int tc = j + dir_col[k];
						if (tr < 0 || tc < 0 || tr >= row || tc >= col) continue;
						if (grid[tr][tc] == '#') continue;

						int u = getIdx(i, j, row, col);
						int v = getIdx(tr, tc, row, col);

						dij.addEdge(u, v, 1);
						dij.addEdge(v, u, 1);
					}
				}
			}
		}

		// calc
		long farest = 0;
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				if (grid[i][j] == '.') {
					dij.initDist();
					int u = getIdx(i, j, row, col);
					dij.calc(u);

					// update
					for (int k=0; k<row*col; k ++) {
						if (dij.dist[k] != inf) {
							farest = Math.max(farest, dij.dist[k]);
						}
					}
				}
			}
		}

		System.out.println(farest);
		return;
	}

	private int getIdx(int r, int c, int row, int col) {
		return r * col + c;
	}

	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
	}
}

class Dijkstra {
    Map<Integer, Map<Integer,Integer>> map_adj;
    int N;
    long inf = Long.MAX_VALUE;
    public long[] dist;
	public int[] pv;

    public Dijkstra(int N) {
        this.N = N;
        map_adj = new HashMap<>();

        dist = new long[N];
        Arrays.fill(dist, inf);

		pv = new int[N];
        Arrays.fill(pv, -1);
    }

    public void initDist() {
        Arrays.fill(dist, inf);
    }

    public void addEdge(int src, int des, int dist) {
        map_adj.putIfAbsent(src, new HashMap<>());
        map_adj.get(src).put(des, dist);
    }

    public void removeEdge(int src, int des) {
        if (map_adj.containsKey(src) && map_adj.get(src).containsKey(des)) {
            map_adj.get(src).remove(des);
        }
    }

    public void calc(int src) {
        Queue<DijkstraState> pq = new PriorityQueue<>();
        pq.offer(new DijkstraState(src, 0));
		dist[src] = 0;
        while(!pq.isEmpty()){
            DijkstraState cur = pq.poll();
            int u = cur.node;
            if (map_adj.containsKey(u)) {
                for (int next : map_adj.get(u).keySet()) {
                    int v = next;
                    int weight = map_adj.get(u).get(next);
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
