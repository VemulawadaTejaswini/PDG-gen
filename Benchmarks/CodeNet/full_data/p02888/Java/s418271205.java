import java.util.*;

class Main {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		ArrayList<Integer> array = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			array.add(scanner.nextInt());
		}

		int count = 0;
		for (int i = 0; i < N - 2; i++) {
			int a = array.get(i);
			for (int j = i + 1; j < N - 1; j++) {
				int b = array.get(j);
				int c = 0;
				for (int k = j + 1; k < N; k++) {
					c = array.get(k);
					if (a < b + c && b < c + a && c < a + b) {
						count++;
					}
				}
			}
		}

		System.out.println(count);

	}
}