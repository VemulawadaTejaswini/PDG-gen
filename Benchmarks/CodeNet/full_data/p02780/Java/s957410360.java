import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			int sum = 0;
			for (int i = 0; i < n - k + 1; i++) {
				int tmp = 0;
				for (int j = i; j < i + k; j++) {
					tmp += list.get(j);
				}
				if (sum < tmp) {
					sum = tmp;
				}
			}
			System.out.println((0.0 + sum + k) / 2);
		}
	}

}
