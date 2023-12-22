import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static List<Integer> analysis(int x, List<Integer> P) {

		if (!P.isEmpty()) {
			for (int i = 0; i < P.size(); i++) {
				if (x % P.get(i) == 0) {
					x /= P.get(i);
				}
			}
		}

		while (x != 1) {
			boolean f = true;
			for (int i = 2; f; i++) {
				if (x % i == 0) {
					P.add(i);
					x /= i;
					i = 0;
					f = false;
				}

			}
		}

		return P;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int f = 0;
		long CommonMulitiple = 1;

		List<Integer> a = new ArrayList<Integer>();
		List<Integer> PrimeNumber = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
			PrimeNumber = analysis(a.get(i), PrimeNumber);
		}

		for (int i = 0; i < PrimeNumber.size(); i++) {
			CommonMulitiple *= PrimeNumber.get(i);
		}

		for (int j = 0; j < n; j++) {
			f += (CommonMulitiple - 1) % a.get(j);
		}

		System.out.println(f);

		sc.close();

	}

}
