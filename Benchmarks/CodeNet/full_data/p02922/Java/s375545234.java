import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int num = 1;
		int ans = 0;

		while (true) {
			num += a-1;
			ans += 1;
			if (num >= b) {
				break;
			}

		}

		if (b==1) {
			System.out.println(0);
		} else {
		System.out.println(ans);
		}
}}