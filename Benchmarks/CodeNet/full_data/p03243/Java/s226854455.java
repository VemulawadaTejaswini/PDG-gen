
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = 0;
		for (int i = 1; i <= 9 ; i++) {
			ans = 100 * i + 10 * i + 1 * i;
			if (ans >= n) {
				break;
			}
		}
		System.out.println(ans);
	}
}