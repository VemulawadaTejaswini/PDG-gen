import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		double total = 0;

		List<Integer> a = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			int ai = sc.nextInt();
			a.add(ai);
			total += ai;
		}

		int count = 0;

		for(int i = 0; i < n; i++) {
			double l = total / (4 * m);
			if(a.get(i) >= l) {
				count++;
			}
		}

		if(count >= m) {
			System.out.println("Yes");
		}else {
			System.out.println("No");

		}

		sc.close();

	}

}
