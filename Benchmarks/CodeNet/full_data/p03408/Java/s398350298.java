
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String blueCard[] = new String[n];
		for (int i = 0; i < n; i++) {
			blueCard[i] = sc.next();
		}

		int m = sc.nextInt();
		String redCard[] = new String[m];
		for (int i = 0; i < m; i++) {
			redCard[i] = sc.next();
		}
		System.out.println(getMax(blueCard, n, redCard, m));
	}

	public static int getMax(String blueCard[], int n, String redCard[], int m) {

		int blueCardCount[] = new int[n];

		for (int i = 0; i < n; i++) {
			blueCardCount[i] = 1;
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (blueCard[i].equals(blueCard[j]))
					blueCardCount[i]++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (blueCard[i].equals(redCard[j]))
					blueCardCount[i]--;
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			if (blueCardCount[i] > max) {
				max = blueCardCount[i];
			}
		}

		return max;
	}

}
