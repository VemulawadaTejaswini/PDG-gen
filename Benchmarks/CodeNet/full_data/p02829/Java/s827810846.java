import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.nextLine());
		int b = Integer.parseInt(scan.nextLine());
		int ans;
		
		if ((a + b) % 3 == 0) {
			ans = 3;
		} else if ((a + b) % 3 == 1) {
			ans = 2;
		} else {
			ans = 1;
		}
		System.out.println(ans);
	}
}
