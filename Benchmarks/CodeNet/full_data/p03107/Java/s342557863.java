import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int cnt = 0;
		while (S.contains("00") || S.contains("11")) {
			System.out.println(S);
			System.out.println(cnt);
			if (S.contains("00")) {
				while (S.contains("00")) {
					S = S.replaceFirst("00", "");
					cnt = cnt + 2;
				}
			} else {
				while (S.contains("11")) {
					S = S.replaceFirst("11", "");
					cnt = cnt + 2;
				}
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}