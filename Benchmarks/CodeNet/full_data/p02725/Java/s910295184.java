import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());

		int[] house = new int[n];
		for (int i = 0; i < n; i++) {
			int point = Integer.parseInt(sc.next());
			if (i > 0 && point - house[i - 1] >= k / 2) {
				house[i] = point - k;
			} else {
				house[i] = point;
			}
		}
		Arrays.sort(house);
		int length = 0;
		for (int i = 0; i < n; i++) {
			if (i < n - 1) {
				length += house[i + 1] - house[i];
			}
		}
		System.out.println(length);

	}

}
