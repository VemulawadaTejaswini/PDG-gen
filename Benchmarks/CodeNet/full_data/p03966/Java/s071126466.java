import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int t = sc.nextInt(), a = sc.nextInt();
		for (int i = 1; i < n; i++) {
			int tt = sc.nextInt(), aa = sc.nextInt();
			while ((double) t / a != (double) tt / aa) {
				if ((double) t / a < (double) tt / aa) { // got more vote for T
					t++;
				} else {
					a++;
				}
			}
		}
		System.out.println(t + a);
	}
}