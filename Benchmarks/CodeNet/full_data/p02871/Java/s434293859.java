import java.io.*;
import java.util.*;

public class Main {
	private int[][] dist, edgeDist;
	private int[][] edges;
	private int[] deliveryTime, deliveryDest;
	private int numVertices, numEdges, tMax, numDeliveries;
	private static final int inf = 99999999;
	private final List<Path> paths = new ArrayList<Path>();
	private final SplittableRandom rnd = new SplittableRandom(999);
	private final double[] log = new double[1 << 16];

	public static void main(String[] args) {
		Main sol = new Main();
		sol.init();
		sol.solve();
		sol.output();
	}

	private void solve() {
		initDistances();
		initPath();
		improvePath();
	}

	private void improvePath() {
		double t0 = 1;
		double temp = t0;
		int duration = 40000000;

		for (int cycle = 0; cycle < duration; cycle++) {
			if ((cycle & 31) == 0) {
				temp = t0 * (duration - cycle) / duration;
			}
			int idx = rnd.nextInt(paths.size());
			Path p = paths.get(idx);
			if (p.l.size() <= 1) continue;
			int a = rnd.nextInt(p.l.size());
			int b = rnd.nextInt(p.l.size());
			if (a > b) {
				int aux = a;
				a = b;
				b = aux;
			}
			int prev = a == 0 ? 1 : deliveryDest[p.l.get(a - 1)];
			int next = b == p.l.size() - 1 ? 1 : deliveryDest[p.l.get(b + 1)];
			int da = deliveryDest[p.l.get(a)];
			int db = deliveryDest[p.l.get(b)];
			int gain = dist[prev][da] + dist[db][next] - (dist[prev][db] + dist[da][next]);
			if (gain >= 0 || (gain < 0 && gain > temp * log[rnd.nextInt(log.length)])) {
				//if (gain < 0) System.err.println(cycle + "\t" + (int)(temp * log[rnd.nextInt(log.length)]));
				Collections.reverse(p.l.subList(a, b + 1));
			}
		}
		for (Path a : paths) {
			a.update();
		}
	}

	private void initPath() {
		Path p = new Path();
		int q = 150;
		for (int i = 1; i <= numDeliveries; i++) {
			p.l.add(i);
			if (p.l.size() == q) { //TODO!
				paths.add(p);
				p = new Path();
				q = 500;
			}
		}
		if (!p.l.isEmpty()) paths.add(p);
		for (Path a : paths) {
			a.update();
			//System.err.println(a);
		}
	}

	private void initDistances() {
		int[] queue = new int[numVertices * numVertices * 4];
		int tot = 0;
		for (int from = 1; from <= numVertices; from++) {
			int[] p = edges[from];
			int f16 = from << 16;
			for (int j = 0; j < p.length; j++) {
				int to = p[j];
				queue[tot++] = f16 | to;
			}
		}
		int curr = 0;
		while (curr < tot) {
			int q = queue[curr++];
			int to = q & 65535;
			int from = q >>> 16;
			int[] df = dist[from];
			int[] dt = dist[to];
			int[] p = edges[to];
			int d = df[to];
			int f16 = from << 16;
			for (int j = 0; j < p.length; j++) {
				int to2 = p[j];
				if (to2 == from) continue;
				int nd = d + dt[to2];
				if (nd < df[to2]) {
					dist[to2][from] = df[to2] = nd;
					queue[tot++] = f16 | to2;
					queue[tot++] = (to2 << 16) | from;
				}
			}
		}
	}

	private void output() {
		StringBuilder sb = new StringBuilder();
		int t = 0;
		OUT: for (Path p : paths) {
			while (t < p.minStart) {
				sb.append("-1\n");
				if (++t == tMax) break OUT;
			}
			int curr = 1;
			System.err.println("P = " + p.l);
			for (int i = 0; i <= p.l.size(); i++) {
				int next = i == p.l.size() ? 1 : deliveryDest[p.l.get(i)];
				List<Integer> a = getPath(curr, next);
				int a0 = a.get(0);
				for (int j = 1; j < a.size(); j++) {
					int a1 = a.get(j);
					int d = edgeDist[a0][a1];
					for (int k = 0; k < d; k++) {
						sb.append(a1).append("\n");
						if (++t == tMax) break OUT;
					}
					a0 = a1;
				}
				curr = next;
			}
		}
		while (t < tMax) {
			sb.append("-1\n");
			t++;
		}
		System.out.print(sb.toString());
		System.out.flush();
	}

	private List<Integer> getPath(int from, int to) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(from);
		System.err.println(from + "->" + to);
		int ff = from;
		while (from != to) {
			int[] e = edges[from];
			for (int next : e) {
				System.err.println(numVertices + " : " + edgeDist.length + ":" + from + ":" + next + ":" + to);
				if (edgeDist[from][next] + dist[next][to] == dist[from][to]) {
					l.add(next);
					from = next;
					break;
				}
			}
		}
		System.err.println(ff + ":" + to + " = " + l);
		return l;
	}

	private void init() {
		for (int i = 0; i < log.length; i++) {
			log[i] = Math.log((i + 0.5) / log.length);
		}
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 65536);
			String[] s = br.readLine().split(" ");
			numVertices = Integer.parseInt(s[0]);
			numEdges = Integer.parseInt(s[1]);
			dist = new int[numVertices + 1][numVertices + 1];
			edgeDist = new int[numVertices + 1][numVertices + 1];
			for (int i = 0; i < dist.length; i++) {
				Arrays.fill(dist[i], inf);
				Arrays.fill(edgeDist[i], inf);
			}
			for (int i = 0; i < dist.length; i++) {
				edgeDist[i][i] = dist[i][i] = 0;
			}
			edges = new int[numVertices + 1][numVertices + 1];
			int[] numPaths = new int[numVertices + 1];
			for (int i = 1; i <= numEdges; i++) {
				s = br.readLine().split(" ");
				int u = Integer.parseInt(s[0]);
				int v = Integer.parseInt(s[1]);
				edgeDist[u][v] = edgeDist[v][u] = dist[u][v] = dist[v][u] = Integer.parseInt(s[2]);
				edges[u][numPaths[u]++] = v;
				edges[v][numPaths[v]++] = u;
			}
			for (int i = 1; i <= numVertices; i++) {
				edges[i] = Arrays.copyOf(edges[i], numPaths[i]);
			}
			tMax = Integer.parseInt(br.readLine());
			deliveryTime = new int[tMax + 2];
			deliveryDest = new int[tMax + 2];
			for (int t = 0; t < tMax; t++) {
				int nNew = Integer.parseInt(br.readLine());
				for (int j = 0; j < nNew; j++) {
					s = br.readLine().split(" ");
					int id = Integer.parseInt(s[0]);
					deliveryTime[id] = t;
					deliveryDest[id] = Integer.parseInt(s[1]);
					numDeliveries = id;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class Path {
		List<Integer> l = new ArrayList<Integer>();
		int minStart, totalDist;

		void update() {
			int curr = 1;
			totalDist = 0;
			minStart = 0;
			NEXT: for (int i = 0; i < l.size(); i++) {
				int idx = l.get(i);
				int t = deliveryTime[idx];
				if (t > minStart) minStart = t;
				int next = deliveryDest[idx];
				for (int j = 0; j < i; j++) {
					if (deliveryDest[l.get(j)] == idx) continue NEXT;
				}
				totalDist += dist[curr][next];
				curr = next;
			}
			totalDist += dist[curr][1];
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Start=").append(minStart);
			sb.append(" : Dist=").append(totalDist);
			sb.append(" :");
			for (int a : l) {
				sb.append(' ').append(a);
			}
			return sb.toString();
		}
	}
}
