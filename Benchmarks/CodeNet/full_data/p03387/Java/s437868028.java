
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] div = new int[2];
		div[0] = 0;
		div[1] = 0;
		div[a % 2]++;
		div[b % 2]++;
		div[c % 2]++;
		if(div[a % 2] == 2) {
			a++;
		}
		if(div[b % 2] == 2) {
			b++;
		}
		if(div[c % 2] == 2) {
			c++;
		}
		int tmp = Math.max(a, Math.max(b, c));
		ans += (tmp - a) / 2;
		ans += (tmp - b) / 2;
		ans += (tmp - c) / 2;
		System.out.println(ans);
	}

}
