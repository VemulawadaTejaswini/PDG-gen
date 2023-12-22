import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long H = scan.nextLong();
		long ans = 0;
		long count = 1;
		while(true) {
			if (H == 1) {
				ans++;
				break;
			}
			else {
				H /= 2;
				count *= 2;			// 分裂するたびに倍攻撃が必要な累乗を保持
				ans += count;
			}
		}
		System.out.println(ans);
	}
}
