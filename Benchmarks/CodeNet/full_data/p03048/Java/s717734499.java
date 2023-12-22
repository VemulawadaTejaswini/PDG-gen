import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		int cnt = 0;

		for (int r = N / R; r > -1; r--) {
			for (int g = (N - R * r) / G; g > -1; g--) {
				for (int b = (N - R * r - G * g) / B; b > -1; b--) {
					if (R * r + G * g + B * b == N)
						cnt++;
				}
			}
		}

		sc.close();
		System.out.println(cnt);
	}
}
