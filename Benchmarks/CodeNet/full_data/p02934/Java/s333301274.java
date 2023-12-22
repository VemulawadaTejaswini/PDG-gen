import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		List<Double> A = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			A.add(scan.nextDouble());
		}

		double ans = 0;
		for(int i = 0; i < N; i++) {
			ans += (1/A.get(i));
		}

		System.out.println(1/ans);
	}
}