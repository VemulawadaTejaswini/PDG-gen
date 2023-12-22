import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 128
//B	Guidebook
public class Main {

	static class Pair {
		int i;
		String S;
		int P;

		Pair(int i, String S, int P) {
			this.i = i;
			this.S = S;
			this.P = P;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Pair> inList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			inList.add(new Pair(i + 1, sc.next(), sc.nextInt()));
		}
		sc.close();

		inList.sort(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				if (o1.S.equals(o2.S)) {
					if (o1.P == o2.P) {
						return o1.i - o2.i;
					}
					return o2.P - o1.P;
				}
				return o1.S.compareTo(o2.S);
			}
		});

		for (Pair pair : inList) {
			System.out.println(pair.i);
		}
	}
}
