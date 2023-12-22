
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] montains = new int[N + 1];
		int westMost = 0;
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			montains[i] = scanner.nextInt();
			if(montains[i] >= westMost) {
				westMost = montains[i];
				ans++;
			}
		}
		System.out.println(ans);
		scanner.close();
	}
}
