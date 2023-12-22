import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int H = 0;
		double maxTemperature = Double.MAX_VALUE;

		for (int i = 0 ; i < N; i++) {
			H = sc.nextInt();
			if (Math.abs(A - (T - H * 0.006)) < maxTemperature) maxTemperature = Math.abs(A - (T - H * 0.006));
		}

		System.out.println(maxTemperature);
	}
}
