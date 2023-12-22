import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int[][] c = new int[10][10];
		for (int i = 0; i < 100; i++) c[i%10][i/10] = 0;
		for (int i = 1; i <= n; i++) {
			String s = String.valueOf(i);
			c[s.charAt(0)-'0'][s.charAt(s.length()-1)-'0']++;
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				ans += c[i][j]*c[j][i];
			}
		}
		System.out.println(ans);
		sc.close();
	}
}