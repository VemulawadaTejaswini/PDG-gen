
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = 0;
		if(a < b) {
			if(b < c) {
				ans = a + b + c * 10;
			} else {
				ans = a + b * 10 + c;
			}
		} else {
			if(a < c) {
				ans = a + b + c * 10;
			} else {
				ans = a * 10 + b + c;
			}
		}
		System.out.println(ans);

	}

}
