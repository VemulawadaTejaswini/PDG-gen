
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();




			HashMap<Integer, HashSet<Edge>>graph = new HashMap<>();
			ArrayList<Edge> edgeList = new ArrayList<>();
			int[]nodeNum = new int[n+1];
			int[]nodeRevNum = new int[n+1];

			for (int i=1;i<=n;i++) {
				graph.put(i, new HashSet<Edge>());
			}

			for (int j=0;j<m;j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				Edge edge = new Edge();
				edge.from=a;
				edge.to=b;
				edge.direction=1;

				graph.get(a).add(edge);
				graph.get(b).add(edge);
				edgeList.add(edge);
			}
			if (m%2==0) {
			ArrayDeque<Integer> q = new ArrayDeque<>();
			q.add(1);
			int number = 1;
			boolean[] used = new boolean[n+1];
			used[1]=true;
			while(!q.isEmpty()) {
				Integer intg = q.poll();
				nodeNum[intg]=number;
				nodeRevNum[number]=intg;
				number++;
				for (Edge e : graph.get(intg)) {
					int tmp = e.from+e.to-intg;
					if (!used[tmp]) {
						q.offer(tmp);
						used[tmp]=true;
					}
				}
			}

			for (int j=n;j>=1;j--) {
				int i = nodeRevNum[j];
				int sum = 0;
				for (Edge e : graph.get(i)) {
					if (e.from==i) {
						sum+=e.direction;
					} else  {
						sum+=(1-e.direction);
					}
				}

				if (sum%2!=0) {
					Edge min = null;
					for (Edge e : graph.get(i)) {
						if (min==null) {
							min=e;
						} else if (nodeNum[e.from+e.to-i] < nodeNum[min.from+min.to-i]) {
							min=e;
						}
					}
					min.direction=1-min.direction;
				}
			}

			for (Edge e : edgeList) {
				if (e.direction==1) {
					System.out.println(e.from+" "+e.to);
				} else {
					System.out.println(e.to+" "+e.from);
				}
			}
		} else {
			System.out.println(-1);
		}
	}
}


class Edge  {
	int from;
	int to;
	int direction; //1:from -> to

}

