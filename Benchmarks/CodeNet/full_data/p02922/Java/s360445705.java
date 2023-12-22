
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		if(b == 1) {
			ans = 0;
		} else if(b <= a) {
			ans = 1;
		} else {
			b -= a;
			a--;
			ans++;
			b += a - 1;
			ans += (b / a);
		}
		System.out.println(ans);

	}

}
