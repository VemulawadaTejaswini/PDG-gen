import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int ans = 0;
		for (int i=1; i<=100; i++) {
			if (a % i == 0 && b % i == 0) {
				ans += 1;
				if (ans == k) {
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
