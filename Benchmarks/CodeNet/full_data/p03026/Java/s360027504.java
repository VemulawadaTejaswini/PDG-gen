import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		Node[] nodes = new Node[N];
		int[][] way = new int[N - 1][2];
		long[] C = new long[N];
		for (int i = 0; i < N; i++) {
			nodes[i] = new Node(i + 1);
		}

		for (int i = 0; i < N - 1; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			way[i][0] = a;
			way[i][1] = b;
			nodes[a - 1].add();
			nodes[b - 1].add();
		}
		for (int i = 0; i < N; i++) {
			C[i] = scn.nextLong();
		}

		Node.setComp(true);
		Arrays.sort(C);
		Arrays.sort(nodes);


		for (int i = 0; i < N; i++) {
			nodes[i].setC(C[i]);
		}
		Node.setComp(false);
		Arrays.sort(nodes);
		long ans = 0;
		for (int i = 0; i < N - 1; i++) {
			int a = way[i][0];
			int b = way[i][1];
			ans += Math.min(nodes[a - 1].getC(), nodes[b - 1].getC());
		}
		System.out.println(ans);
		for(int i = 0;i < N;i++) {
			if(i == N-1) {
				System.out.println(nodes[i].getC());
			}else {
				System.out.print(nodes[i].getC() + " ");
			}

		}
	}

}

class Node implements Comparable<Node> {
	int N;
	int num;
	long c;
	static boolean comp_num;

	public Node(int N) {
		this.N = N;
		this.num = 0;
	}

	void add() {
		this.num++;
	}

	void setC(long c) {
		this.c = c;
	}

	static void setComp(boolean comp) {
		comp_num = comp;
	}

	long getC() {
		return this.c;
	}

	@Override
	public int compareTo(Node o) {
		if (comp_num) {
			if (this.num > o.num)
				return 1;
			if (this.num < o.num)
				return -1;
			return 0;
		} else {
			if (this.N > o.N)
				return 1;
			if (this.N < o.N)
				return -1;
			return 0;
		}
	}

}
