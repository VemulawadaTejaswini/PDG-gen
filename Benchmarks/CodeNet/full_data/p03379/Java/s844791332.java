import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		ArrayList<Integer> X = new ArrayList<Integer>();
		int i;
		for (i = 0; i < N; i++) {
			X.add(sc.nextInt());
		}

		for (i = 0; i < N; i++) {
			int n;
			// 全てをたよっちゃう。
			ArrayList<Integer> Y = new ArrayList<Integer>();
			for (n = 0; n < X.size(); n++) {
				Y.add(X.get(n));
			}
			Y.remove(i);
			Collections.sort(Y);
			System.out.println(Y.get((N - 1) / 2));
		}
	}
}
