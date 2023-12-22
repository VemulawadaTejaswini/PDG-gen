import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int maxAB = Math.max(A, B);
		int minAB = Math.min(A, B);

		if (maxAB > minAB + 1) {
			System.out.println(maxAB + maxAB - 1);
		} else {
			System.out.println(maxAB + minAB);
		}
	}

}