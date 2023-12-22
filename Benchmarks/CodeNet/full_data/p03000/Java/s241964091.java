
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int d = 0;
		int ans = 1;
		for(ans = 1; ans < n + 2; ans++) {
			d += sc.nextInt();
			if(d > x) {
				break;
			}
		}
		System.out.println(ans);
	}

}
