import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[m];

		int left = 0;
		int right = 0;
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			if (a[i] < x) left++;
			if (x < a[i]) right++;
		}

		if (left < right) {
			System.out.println(left);
		} else {
			System.out.println(right);
		}

		sc.close();
	}

}
