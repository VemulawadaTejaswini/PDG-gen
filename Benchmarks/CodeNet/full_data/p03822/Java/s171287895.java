import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double N = sc.nextDouble();
			double judge = N;
			int cnt = 0;
			while (true) {
				cnt++;
				judge = judge / 2;
				if (judge < 1) {
					break;
				}
			}
			System.out.println(cnt);
		}
	}
}
