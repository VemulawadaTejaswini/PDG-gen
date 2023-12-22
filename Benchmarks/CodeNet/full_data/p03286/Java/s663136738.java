import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if (n == 0) {
			System.out.println(0);
			return;
		}

		List<Integer> list = new ArrayList<>();
		while (n != 1) {
			if (n < 0) {
				list.add(-n % 2);
				n = (-n + 1) / 2;
			} else {
				list.add(n % 2);
				n = -(n / 2);
			}
		}
		System.out.print(1);
		Collections.reverse(list);
		for (int i : list) {
			System.out.print(i);
		}
		System.out.println();
	}
}
