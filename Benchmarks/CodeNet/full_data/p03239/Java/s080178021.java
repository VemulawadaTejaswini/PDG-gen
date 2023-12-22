import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int T = scanner.nextInt();
		int ans = 2000;
		for (int i= 0; i<n; i++){
			int c = scanner.nextInt();
			int t = scanner.nextInt();
			if (t<=T) ans = Math.min(ans, c);
		}
		if (ans == 2000) System.out.println("TLE");
		else System.out.println(ans);
	}
}