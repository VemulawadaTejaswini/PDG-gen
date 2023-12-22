import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int xG = -x;
		int yG = -y;
		int ans = Integer.MAX_VALUE;
		if(x <= y) {
			ans = Math.min(ans, y-x);
		}
		if(xG <= y) {
			ans = Math.min(ans, y-xG+1);
		}
		if(x <= yG) {
			ans = Math.min(ans, yG-x+1);
		}
		if(xG <= yG) {
			ans = Math.min(ans, yG-xG+2);
		}
		System.out.println(ans);
	}
}