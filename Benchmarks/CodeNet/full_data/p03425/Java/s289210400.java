import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		int m = 0;
		int a = 0;
		int r = 0;
		int c = 0;
		int h = 0;
		String head = "";

		for (int i = 0; i < N; i++) {
			head = sc.next().substring(0, 1);
			if (head.equals("M")) {
				m++;
			} else if (head.equals("A")) {
				a++;
			} else if (head.equals("R")) {
				r++;
			} else if (head.equals("C")) {
				c++;
			} else if (head.equals("H")) {
				h++;
			}
		}

		long ans = m * a * r + m * a * c + m * a * h + m * r * c + m * r * h + m * c * h + a * r * c + a * r * h
				+ a * c * h + r * c * h;

		// 出力
		System.out.println(ans);
	}
}
