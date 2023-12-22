import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		long ans = 1;
		long count = 0;
		if(a >= b) {
			ans = ans + k;
		} else {
			long hitNum = ans + k;
			ans = a;
			count = a - 1;
			while(count <= k-2) {
				ans += b-a;
				count += 2;
			}
			while(count < k) {
				ans++;
				count++;
			}
			ans = Math.max(ans, hitNum);
		}
		System.out.println(ans);
	}
}