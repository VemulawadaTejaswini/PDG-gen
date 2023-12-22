import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numN = scan.nextInt();

		List<Double> numA = new ArrayList<>();

		for (int i = 0; i < numN; i++) {
			numA.add(1.0 / scan.nextDouble());
		}

		double sum = 0.0;

		for (double num: numA) {
			sum += num;
		}

		System.out.println(1.0 / sum);
	}
}
