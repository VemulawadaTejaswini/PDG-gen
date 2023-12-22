import java.util.ArrayList;
import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		Pair[] P = new Pair[N - 1];

		ArrayList<ArrayList<Integer>> Path = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < N; i++) {
			Path.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < N - 1; i++) {
			int a = scn.nextInt() - 1, b = scn.nextInt() - 1;
			P[i] = new Pair(a, b);
			Path.get(a).add(b);
			Path.get(b).add(a);
		}
		int K = 0;
		for (int i = 0; i < N; i++) {
			K = Math.max(K, Path.get(i).size());
		}
		ArrayList<ArrayList<Integer>> num = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < N; i++) {
			num.add(new ArrayList<Integer>());
		}

		System.out.println(K);
		for (int i = 0; i < N - 1; i++) {
			Pair p = P[i];
			for (int j = 1; j <= K; j++) {
				if (!num.get(p.first).contains(j) && !num.get(p.second).contains(j)) {
					System.out.println(j);
					num.get(p.first).add(j);
					num.get(p.second).add(j);
					break;
				}
			}
		}
	}

}

class Pair implements Comparable<Pair> {
	int first, second;

	public Pair(int f, int s) {
		this.first = f;
		this.second = s;
	}

	@Override
	public int compareTo(Pair o) {// Comparatorを自由記述せよ(これはfirstが小さい順, secondが小さい順)
		if (this.first < o.first) {
			return -1;
		}
		if (this.first > o.first) {
			return 1;
		}
		if (this.second < o.second) {
			return -1;
		}
		if (this.second > o.second) {
			return 1;
		}

		return 0;
	}
}