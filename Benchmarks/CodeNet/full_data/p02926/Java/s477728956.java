import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	class Node implements Comparable<Node> {
		double x, y;

		public Node(double x, double y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Node o) {
			return Double.compare(Math.atan2(y, x), Math.atan2(o.y, o.x));
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] X = new double[N];
		double[] Y = new double[N];
		Node[] nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			X[i] = sc.nextDouble();
			Y[i] = sc.nextDouble();
			nodes[i] = new Node(X[i], Y[i]);
		}
		Arrays.sort(nodes);
		double ans = 0;
		for (int i = 0; i < N; ++i) {
			double curx = 0, cury = 0;
			for (int j = 0; j < N; ++j) {
				curx += nodes[(i + j) % N].x;
				cury += nodes[(i + j) % N].y;
				ans = Math.max(ans, curx * curx + cury * cury);
			}
		}
		ans=Math.sqrt(ans);
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
