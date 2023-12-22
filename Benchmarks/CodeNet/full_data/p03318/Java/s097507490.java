import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String ans = "";
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		int num;
		for(num = 0; num < 9;) {
			num++;
			ans += num + "\n";
			k--;
			if(k <= 0) {
				System.out.println(ans);
				return;
			}
		}
		loop:for(int i = 1;; i++) {
			for(int j = 1; j < 10 * i; j++) {
				num += Math.pow(10, i);
				ans += num + "\n";
				k--;
				if(k <= 0)break loop;
			}
		}
		System.out.println(ans);
	}
}
