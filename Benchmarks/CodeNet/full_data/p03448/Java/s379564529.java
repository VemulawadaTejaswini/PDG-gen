import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int ans = 0;

		for(int i = 0; i <= A; i++) {
			for(int j = 0; j <= B; j++) {
			  int tmp = X - i*500 - j*100;
				if (0 <= tmp && tmp <= C*50) {
						ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
