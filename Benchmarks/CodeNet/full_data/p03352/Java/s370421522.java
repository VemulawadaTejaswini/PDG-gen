
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = 0;
		for (int i = n; 0 < i; i--) {
			ans = (int) Math.sqrt(n);
			if (ans * ans == n) break;
		}
		System.out.println(ans * ans);

	}
}