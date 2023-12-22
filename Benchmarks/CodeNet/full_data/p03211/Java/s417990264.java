import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int ans = 999;
		for (int i = 0; i < S.length() - 2; i++) {
			String ss = S.substring(i, i + 3);
			int num = Integer.parseInt(ss);
			if (ans > Math.abs(num - 753))
				ans = Math.abs(num - 753);
		}
		System.out.println(ans);
	}
}
