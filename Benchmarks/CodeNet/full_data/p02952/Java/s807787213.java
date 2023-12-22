
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		int ans = 0;

		if (num < 10) {
			ans = num;
		} else if (num < 100) {
			ans = 9;
		} else if (num < 1000) {
			ans = num - 99 + 9;
		} else if (num < 10000) {
			ans = 999 - 99 + 9;
		} else if (num < 100000) {
			ans = num - 9999 + 999 - 99 + 9;
		} else if (num < 1000000) {
			ans = 99999 - 9999 + 999 - 99 + 9;
		}

		System.out.println(ans);

	}
}
