import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int X = input.nextInt();
		int Y = input.nextInt();
		ArrayList<Integer>[] graph = new ArrayList[N+1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i < N; i++) {
			graph[i].add(i+1);
			graph[i+1].add(i);
		}
		graph[X].add(Y);
		graph[Y].add(X);
		/*for (int i = 1; i <= N; i++) {
			System.out.print(i+"-->");
			for (int j = 0; j < graph[i].size(); j++) {
				System.out.print(graph[i].get(j)+"-->");
			}
			System.out.print("\n");
		}*/
		ArrayList<Integer> S = new ArrayList<Integer>();
		ArrayList<Integer> E = new ArrayList<Integer>();
		for (int k = 1; k < N; k++) {
			int track = 0;
			for (int a = 1; a < N; a++) {
				for (int b = a+1; b <= N; b++) {
					boolean valid = true;
					for (int j = 0; j < S.size(); j++) {
						if (S.get(j)==a&&E.get(j)==b) valid = false;
					}
					if (valid) {
						if (BFS(graph,a,b)==k) {
							track++;
							S.add(a);
							E.add(b);
						}
					} 
				}
			}
			System.out.println(track);
		}
	}
	public static int BFS(ArrayList<Integer>[] graph, int START, int END) {
		if (START==END) return 0;
		int cnt = 0;
		Queue<ArrayList<Integer>> cur = new LinkedList<ArrayList<Integer>>();
		boolean[] vis = new boolean[graph.length+1];
		cur.add(graph[START]);
		vis[START]=true;
		while (!cur.isEmpty()) {
			cnt++;
			int size = cur.size();
			for (int i = 0; i < size; i++) {
				ArrayList<Integer> x = cur.poll();
				for (int j = 0; j < x.size(); j++) {
					if (x.get(j)==END) return cnt;
					if (!vis[x.get(j)]) {
						vis[x.get(j)]=true;
						cur.add(graph[x.get(j)]);
					}
				}
			}
		}
		return -1;
	}
}