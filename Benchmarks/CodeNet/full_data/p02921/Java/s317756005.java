import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String T = sc.nextLine();

		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			String si = S.substring(i, i + 1);
			String ti = T.substring(i, i + 1);
			cnt += si.equals(ti) ? 1 : 0;
		}
		System.out.println(cnt);
	}
}