import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");

		int L = Integer.parseInt(line[0]);
		int R = Integer.parseInt(line[1]);

		long minVal = Integer.MAX_VALUE;
		for (long i = L; i <= R; i++) {
			for (long j = i + 1; j <= R; j++) {
				minVal = Math.min(minVal, (i * j) % 2019);
				if (minVal == 0) {
					System.out.println(minVal);
					return;
				}
			}
		}
		System.out.println(minVal);
	}
}