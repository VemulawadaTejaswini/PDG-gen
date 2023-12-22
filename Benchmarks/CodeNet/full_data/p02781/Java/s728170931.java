import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			int num = sc.nextInt();
			String head = str.substring(0, num);
			long ans = 0;
			if (num == 1) {
				ans += Long.parseLong(head);
				ans += (str.length() - 1) * 9;
				System.out.println(ans);
			}
			if (num == 2) {
				int i = Integer.parseInt(head.substring(0, 1));
				int j = Integer.parseInt(head.substring(1, 2));
				ans += j;
				ans += 9 * (str.length() - head.length());
				ans += (i - 1) * 9 * (str.length() + 1 - head.length());
				if (!str.equals(head)) {
					ans += ((str.length() - 1) * (str.length() - 2)) * 81 / 2;
				}
				System.out.println(ans);
			}
			if (num == 3) {
				int i = Integer.parseInt(head.substring(0, 1));
				int j = Integer.parseInt(head.substring(1, 2));
				int k = Integer.parseInt(head.substring(2, 3));
				ans += k;
				ans += (j - 1) * 9 * (str.length() + 1 - head.length());
				ans += 9 * (str.length() - head.length());
				ans += ((str.length() - 2) * (str.length() - 3)) * 81 / 2;
				ans += (i - 1) * ((str.length() - 1) * (str.length() - 2)) * 81 / 2;
				if (!str.equals(head)) {
					ans += ((str.length() - 1) * (str.length() - 2) * (str.length() - 3)) * 729 / 6;
				}
				System.out.println(ans);
			}
		}
	}
}