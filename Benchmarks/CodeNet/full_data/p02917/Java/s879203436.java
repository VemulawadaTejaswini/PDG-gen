import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		List<Integer> A = new ArrayList<>();
		List<Integer> B = new ArrayList<>();

		for (int i = 0; i < N - 1; i++) {
			B.add(scanner.nextInt());
		}
		scanner.close();

		int tmp = 0;
		for (int i = 0; i < N - 1; i++) {

			int num = B.get(i);
			if (i == 0) {
				A.add(num);
				A.add(num);
			} else {
				A.add(num);
				//A.stream().forEach(a -> System.out.print(a + " "));
				// System.out.println("");
				// System.out.println(tmp + "," + num);
				if (num < tmp) {

					// int tmp2 = num;
					for (int j = i - 1; j >= 0; j--) {
						// System.out.println(B.get(j));
						if (B.get(j + 1) < Math.max(A.get(j + 1), A.get(j))) {
							A.set(j + 1, A.get(j + 2));
							// System.out.println(j + 1 + "に" + A.get(j + 2));
						} else {
							break;
						}
						// tmp2 = A.get(j);
					}
				}
			}
			tmp = num;
		}
		System.out.println(A.stream().reduce(0, (a, b) -> a + b));
	}
}