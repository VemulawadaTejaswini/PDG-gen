
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int n = in.nextInt(), m = in.nextInt();
			int nums = 1;
			Node[] a = new Node[m];
			for (int i = 0; i < m; i++) {
				a[i] = new Node(in.nextInt(), in.nextInt());
			}
			Arrays.sort(a);
			for (int i = 1; i < m; i++) {
				if (a[i].qian >= a[i - 1].hou)
					nums++;
			}
			System.out.println(nums);
		}
	}
}

class Node implements Comparable<Node> {
	int qian, hou;

	public Node(int qian, int hou) {
		this.hou = hou;
		this.qian = qian;
	}

	public int compareTo(Node o) {
		if (this.qian == o.qian)
			return o.hou - this.hou;
		else
			return this.qian - o.qian;
	}
}