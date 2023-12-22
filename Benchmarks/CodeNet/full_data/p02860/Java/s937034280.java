import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String S = in.next();
		String ans = "No";
		if (N % 2 == 0) {
			String a = S.substring(0, N / 2);
			String b = S.substring(N / 2);
			if (a.equals(b)) {
				ans = "Yes";
			}
		}
		System.out.println(ans);
		in.close();
	}
}