import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int x = in.nextInt();
		int ans = 0;
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				for (int j2 = 0; j2 <= c; j2++) {
					int sum = (500 * i) + (100 * j) + (50 * j2);
					if (x == sum) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		in.close();
	}
}