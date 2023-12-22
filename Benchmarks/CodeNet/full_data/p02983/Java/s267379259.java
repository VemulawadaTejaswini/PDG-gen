import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		long min = Long.MAX_VALUE;

		for (int i = l; i < r; i++) {
			for (int j = i + 1; j <= r; j++) {
				int calc = (i * j) % 2019;
				min = Math.min(min, calc);
			}
		}

		System.out.println(min);



	}

}
