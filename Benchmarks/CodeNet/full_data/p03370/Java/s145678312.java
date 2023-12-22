import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int minM = Integer.MAX_VALUE;
		int sumM = 0;
		while (sc.hasNextInt()) {
			int m = sc.nextInt();
			if (m < minM) {
				minM = m;
			}
			sumM += m;
		}

		System.out.println(N + ((X - sumM) / minM));
	}
}