import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());

		int min = X - (K-1);
		int max = X + (K-1);

		if (min < -1000000) {
			min = -1000000;
		}
		if (max > 1000000) {
			max = 1000000;
		}

		int idx;
		for (idx = min; idx <= max; idx++) {
			System.out.print(idx + " ");
		}

	}

}
