import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String copy = s;
		boolean loop = true;
		int num = 0;
		int ans = 0;
		while (loop) {
			s=s.replace("ABC", "");

			num = copy.length() - s.length();
			ans = ans + num / 3;

			if (num == 0) {
				loop = false;
			}
			s = copy;
			s=s.replace("ABC", "BCA");
			copy = s;

		}

		System.out.println(ans);
	}
}