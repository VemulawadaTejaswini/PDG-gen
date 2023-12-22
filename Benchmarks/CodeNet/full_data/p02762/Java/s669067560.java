import java.util.*;

public class Main {

	static class Unionfind{
		//基本的にマイナスのサイズを持つ
		//根でなければ非負のおやのIDを持つ
		private int d[];
		
		public Unionfind(int n) {
			d = new int[n + 1];
			//初めは全員根でサイズは１なので-1で初期化
			for (int i = 0; i <= n; ++i)
				d[i] = -1;
		}
		
		public int root(int x) {
			if (d[x] < 0)
			return x;
			return d[x] = root(d[x]);
		}
		
		public boolean unite(int x, int y) {
			int rx = root(x);
			int ry = root(y);
			if(rx == ry)return false;
			//もしxのグループのほうがサイズが小さければxの親をyとしなければいけないので入れ替える。
			if(d[x] > d[y]){
				int tmp = x;
				x = y;
				y = tmp;
			}
			//yの親をxにするのでIDxのグループのサイズがd[y]だけ増える
			d[x] += d[y];
			d[y] = x;
			return true;
		}
		
		public boolean isSame(int x, int y) {
			int rx = root(x);
			int ry = root(y);
			return rx == ry;
		}
		
		public int size(int x){
			int rx = root(x);
			return -d[rx];
		}
	}
	
	static Unionfind uniontree;
	
	public static class Graph {
		List<Integer> friend = new ArrayList<Integer>();
		List<Integer> block = new ArrayList<Integer>();
		int number;

		public Graph(int num){
			number = num;
		}

		public void addfriend(int b) {
			friend.add(b);
		}

		public void addblock(int b) {
			if(uniontree.isSame(number, b))
			block.add(b);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		Graph graph[] = new Graph[n + 1];
		uniontree = new Unionfind(n);
		for (int i = 0; i <= n; ++i)
			graph[i] = new Graph(i);
		for (int i = 0; i < m; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].addfriend(b);
			graph[b].addfriend(a);
			uniontree.unite(a, b);
		}
		for (int i = 0; i < k; ++i) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			graph[c].addblock(d);
			graph[d].addblock(c);
		}
		sc.close();
		for (int i = 1; i <= n; ++i) {
			int num = uniontree.size(i) - (graph[i].friend.size() + graph[i].block.size()) - 1;
			// int num = uniontree.size(i);
			System.out.print(num + " ");
		}
	}
}
