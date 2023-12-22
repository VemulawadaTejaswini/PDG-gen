import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int ans = 1;
		for (int i = 2; i <= x; i++) {
			int temp = i*i;
			for (int j = 2; j <= x; j++) {
			
				if (temp > x) {
					break;
				}
				ans = Math.max(temp, ans);
				temp *= i;
			}
		}
		System.out.println(ans);
	}
}