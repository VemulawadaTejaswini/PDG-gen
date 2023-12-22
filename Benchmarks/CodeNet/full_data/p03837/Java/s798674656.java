import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList[] gragh;
	static int n, m;
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		init();

		for(int i = 0;i < n;i++){
			dijkstra(i);
		}
		int count = 0;
		for(int i = 0;i < n;i++){
			for(int j = 0;j < gragh[i].size();j++){
				Ed edge = (Ed)gragh[i].get(j);
				if(!edge.used)count++;
			}
		}

		System.out.println(count/2);
	}

	static void dijkstra(int a) {// node aからの各nodeまでの最短を計算
		boolean used[] = new boolean[n];
		int shortest[] = new int[n];
		Ed myEdge[] = new Ed[n];
		for (int i = 0; i < n; i++) {
			shortest[i] = 999999999;
		}
		shortest[a] = 0;

		for (int i = 0; i < n; i++) {
			int next = 999999999;
			int nextN = a;
			for (int j = 0; j < n; j++) {
				if (!used[j] && shortest[j] < next) {
					next = shortest[j];
					nextN = j;
				}
			}
			used[nextN] = true;
			if(nextN != a){
				myEdge[nextN].used = true;
				for(int j = 0;j < gragh[nextN].size();j++){
					Ed e = (Ed)gragh[nextN].get(j);
					if(shortest[nextN]-e.cost == shortest[e.node]){
						e.used = true;
					}
				}
			}

			for (int j = 0; j < gragh[nextN].size(); j++) {
				Ed edge = (Ed) gragh[nextN].get(j);
				if (shortest[edge.node] > shortest[nextN] + edge.cost) {
					shortest[edge.node] = shortest[nextN] + edge.cost;
					myEdge[edge.node] = edge;
				}
			}
		}

		return;
	}

	static void init() {
		gragh = new ArrayList[n];

		for (int i = 0; i < n; i++) {
			gragh[i] = new ArrayList<Ed>();
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();

			gragh[a].add(new Ed(b, c));
			gragh[b].add(new Ed(a, c));
		}
	}
}

class Ed {
	int node;
	int cost;
	boolean used;

	Ed(int node, int cost) {
		this.node = node;
		this.cost = cost;
		used = false;
	}
}
