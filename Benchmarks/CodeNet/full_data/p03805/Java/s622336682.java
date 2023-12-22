import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
		ArrayList<String> inLines = new ArrayList<String>();
		for (; cin.hasNext();) {
			inLines.add(cin.nextLine());
		}
		Solver solver = new Solver();
		solver.solve(inLines);
	}
}

class Solver {
	class Path {
		int a;
		int b;

		Path(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	class Vertex {
		int Num;
		HashSet<Integer> Link;
		boolean pathed;

		Vertex(int n) {
			this.Num = n;
			Link = new HashSet<Integer>();
			pathed = false;
		}

		void cnt(int len) {
			if (len == N) {
				CNT++;
				return;
			}
			pathed = true;
			for (Integer v : Link) {
				if (!VertexMap.get(v).pathed) {
					VertexMap.get(v).cnt(len + 1);
				}
			}
			pathed = false;
		}

		void addLink(Path p) {
			if (p.a == Num)
				Link.add(p.b);
			else if (p.b == Num)
				Link.add(p.a);
		}
	}

	int N;
	int M;
	HashMap<Integer, Vertex> VertexMap;
	int CNT;

	public void solve(ArrayList<String> inLines) {
		String[] strArr = inLines.get(0).split(" ");
		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);

		ArrayList<Path> pathList = new ArrayList<Path>();
		for (int i = 0; i < M; i++) {
			String[] strPath = inLines.get(i + 1).split(" ");
			int a = Integer.parseInt(strPath[0]);
			int b = Integer.parseInt(strPath[1]);
			pathList.add(new Path(a, b));
		}

		// System.out.println("N=" + N + " M=" + M);
		// for (Path p : pathList) {
		// System.out.println(" " + p.a + " " + p.b);
		// }

		VertexMap = new HashMap<Integer, Vertex>();
		for (int i = 1; i <= N; i++)
			VertexMap.put(i, new Vertex(i));
		for (Path p : pathList) {
			VertexMap.get(p.a).addLink(p);
			VertexMap.get(p.b).addLink(p);
		}

		CNT = 0;
		VertexMap.get(1).cnt(1);
		System.out.println(CNT);
	}
}
