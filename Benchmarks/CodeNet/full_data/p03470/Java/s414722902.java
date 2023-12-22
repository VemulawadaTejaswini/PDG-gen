import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no2();
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			System.out.println("2018/01/" + str.substring(8));
		}
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = 0;
			}

			int ans = 0;
			for (int i = 0; i < n; i++) {
				int flg = 0;
				int t = sc.nextInt();
				for (int j = 0; j < n; j++) {
					if (a[j] == t) {
						flg = 1;
						break;
					}
				}
				if (flg == 0) {
					ans++;
				}
				a[i] = t;
			}
			System.out.println(ans);
		}
	}
}
