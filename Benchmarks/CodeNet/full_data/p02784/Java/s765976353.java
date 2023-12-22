import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int n1 = sc.nextInt();
		long h = n1;

		int n2 = sc.nextInt();
		int n = n2;

		boolean flg = false;

		for (int i = 0; i < n; i++) {
			int n3 = sc.nextInt();
			h = h - n3;
			if (h <= 0) {
				flg = true;
				break;
			}
		}

		if (flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
