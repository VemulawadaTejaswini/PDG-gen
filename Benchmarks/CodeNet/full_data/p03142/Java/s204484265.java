import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<ArrayList<Integer>> parents = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			parents.add(new ArrayList<>());
		}
		int[] out = new int[N];
		for (int i = 0; i < N - 1 + M; i++) {
			int A = Integer.parseInt(sc.next()) - 1;
			int B = Integer.parseInt(sc.next()) - 1;
			parents.get(B).add(A);
			out[A]++;
		}
		HashSet<Integer> cur = new HashSet<>();
		int[] layer = new int[N];
		for (int i = 0; i < N; i++) {
			if (out[i] == 0) cur.add(i);
		}
		for (int i = 1; !cur.isEmpty(); i++) {
			HashSet<Integer> next = new HashSet<>();
			for (int c : cur) {
				next.addAll(parents.get(c));
			}
			for (int p : next) {
				layer[p] = i;
			}
			cur = next;
		}
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < N; i++) {
			int parent = -1;
			int min = Integer.MAX_VALUE;
			for (int p : parents.get(i)) {
				if (layer[p] < min) {
					min = layer[p];
					parent = p;
				}
			}
			writer.println(parent + 1);
		}
		writer.flush();
	}

}
