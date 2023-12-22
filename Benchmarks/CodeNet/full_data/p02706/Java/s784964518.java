import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			list.add(scanner.nextInt());
		}

		int sum = list.stream().reduce(0, Integer::sum);
		int result = (sum <= n) ? n - sum : -1;
		System.out.println(result);

		scanner.close();
	}

}
