import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		List<Integer> x = new ArrayList<>();
		List<Integer> y = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			x.add(scan.nextInt());
			y.add(scan.nextInt());
		}
		double tmp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tmp += Math.sqrt(
						(x.get(i) - x.get(j)) * (x.get(i) - x.get(j)) + (y.get(i) - y.get(j)) * (y.get(i) - y.get(j)));
			}
		}
		System.out.println(tmp / n);
	}
}