import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] num = new int[200000];
		int chk = 0;

		for (int i = 0; i < n; i++) {
			num[sc.nextInt()]++;
		}

		for (int i = 0; i < 200000; i++) {
			if (num[i] > 1) {
				System.out.println("NO");
				chk++;
				break;
			}
		}
		if (chk == 0) {
			System.out.println("YES");
		}
	}

}
