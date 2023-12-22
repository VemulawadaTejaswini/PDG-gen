import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();

		List<Integer> cost = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			cost.add(sc.nextInt());
		}

		int temp = 0;
		for (int i = 0; i <= x; i++) {
			if (cost.contains(i)) {
				temp++;
			}
		}

		int op = 0;
		for (int i = x; i <= n; i++) {
			if (cost.contains(i)) {
				op++;
			}
		}
		System.out.println(Math.min(op, temp));
	}

}