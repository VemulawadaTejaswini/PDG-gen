import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxPotision = 0;
		int maxValue = 0;
		int secondValue = 0;
		boolean maxDup = false;
		for (int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			if (tmp == maxValue) {
				maxDup = true;
			} else if (tmp > maxValue) {
				secondValue = maxValue;
				maxValue = tmp;
				maxPotision = i;
				maxDup = false;
			} else if (tmp > secondValue) {
				secondValue = tmp;
			}
		}
		if (maxDup) {
			for (int i = 0; i < N; i++) {
				System.out.println(maxValue);
			}
		} else {
			for (int i = 0; i < N; i++) {
				if (i == maxPotision) {
					System.out.println(secondValue);
				} else {
					System.out.println(maxValue);
				}
			}
		}
	}
}