import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] num = new int[2000000];
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			num[sc.nextInt()]++;
		}

		for (int i = 0; i < 2000000; i++) {
			if (num[i] > 1) {
				System.out.println("NO");
				cnt++;
				break;
			}
		}
		if (cnt == 0) {
			System.out.println("YES");
		}
	}

}
