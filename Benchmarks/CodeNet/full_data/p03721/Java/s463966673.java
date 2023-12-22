import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int[][] list = new int[n][2];

		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			list[i][0] = a;
			list[i][1] = b;
		}
		Arrays.sort(list, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		int count = 0;
		int ans = 0;
		int num = 0;
		do {
			ans = list[count][0];
			num += list[count][1];
			count++;
		} while (num >= k);

		System.out.println(ans);
		scanner.close();
	}
}
