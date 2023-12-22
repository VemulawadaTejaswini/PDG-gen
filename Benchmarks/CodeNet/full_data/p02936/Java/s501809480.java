import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), q = in.nextInt();

		List<node> nodes = new ArrayList<node>();
		for(int i = 0; i < n; i++)
			nodes.add(new node());

		for(int i = 1; i < n; i++) {
			int a = in.nextInt(), b = in.nextInt();
			nodes.get(a-1).connect(nodes.get(b-1));
		}

		for(int i = 1; i <= q; i++) {
			int p = in.nextInt(), x = in.nextInt();
			nodes.get(p-1).add(x);
		}

		for(int i = 0; i < n; i++)
			System.out.println(nodes.get(i).c);
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