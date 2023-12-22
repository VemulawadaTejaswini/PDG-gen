import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static private class Tree {
		List<Integer> t = new ArrayList<Integer>();;
	}

	static Tree[] tree;
	static long[] answer;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int q = in.nextInt();
		tree = new Tree[n + 1];
		answer = new long[n + 1];
		for (int i = 1; i < n + 1; i++)
			tree[i] = new Tree();
		for (int i = 1; i < n; i++)
			addTree(in.nextInt(), in.nextInt());
		for (int i = 0; i < q; i++)
			answer[in.nextInt()] += in.nextInt();
		doTree(0, 1);
		for (int i = 1; i < n + 1; i++)
			System.out.println(answer[i]);
	}

	private static void doTree(int p, int n) {
		answer[n] += answer[p];
		for (int i = 0; i < tree[n].t.size(); i++) {
			int nn = tree[n].t.get(i);
			if (nn != p)
				doTree(n, nn);
		}
	}

	private static void addTree(int a, int b) {
		tree[a].t.add(b);
		tree[b].t.add(a);
	}
}