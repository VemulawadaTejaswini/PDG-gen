import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int score = 0;
		int lowest = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (lowest == 0) {
				lowest = x;
			}
			if(x < lowest && (x % 10 != 0)) {
				lowest = x;
			}
			score += x;
		}
		if (score % 10  > 0) {
			System.out.println(score);
		} else {
			score -= lowest;
			if (score % 10 > 0) {
				System.out.println(score);
			} else {
				System.out.println("0");
			}
		}
		sc.close();
	}
}