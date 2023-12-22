import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int numN = scan.nextInt();
		int numM = scan.nextInt();

		double[] cost = new double[numN];

		for (int i = 0;  i < numN; i++) {
			cost[i] = scan.nextDouble();
		}

		for (int i = 0;  i < numM; i++) {
			Arrays.sort(cost);
			cost[numN-1] /= 2.0;
		}

		long sum = 0L;
		for (double i : cost) {
			sum += i;
		}

		System.out.println(sum);
	}
}