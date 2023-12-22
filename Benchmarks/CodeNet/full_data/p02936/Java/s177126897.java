import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), q = in.nextInt();

		node[] nodes = new node[n];
		for(int i = 0; i < n; i++)
			nodes[i] = new node();

		for(int i = 1; i < n; i++) {
			int a = in.nextInt(), b = in.nextInt();
			nodes[a-1].connect(nodes[b-1]);
		}

		for(int i = 1; i <= q; i++) {
			int p = in.nextInt(), x = in.nextInt();
			nodes[p-1].add(x);
		}

		for(int i = 0; i < n; i++)
			System.out.println(nodes[i].c);
	}
}

class node{
	long c;
	List<node> next = new ArrayList<node>();

	public node() {
		c = 0;
	}

	public void connect(node b) {
		next.add(b);
	}

	public void add(int n) {
		c += n;
		int size = next.size();

		for(int i = 0; i < size; i++)
			next.get(i).add(n);
	}
}