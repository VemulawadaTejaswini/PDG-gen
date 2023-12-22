import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int in = sc.nextInt();
			list.add(in);
			sum += in;
		}

		double m1 = sum / (4 * m);
		int count = 0;
		for (Integer i : list) {
			if (i >= m1) {
				count++;
			}
		}
		if (count >= m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
