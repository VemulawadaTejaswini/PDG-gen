import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int result = 0;
		int tmp = 2147483647;
		for (int i=1; i<=n; i++) {
			int tmp1 = Math.abs(a- (int) (Math.abs((t - sc.nextInt()) * 0.006)));
			if (tmp1 < tmp) {
				tmp = tmp1;
				result = i;
			}
		}
		System.out.println(result);
	}
}