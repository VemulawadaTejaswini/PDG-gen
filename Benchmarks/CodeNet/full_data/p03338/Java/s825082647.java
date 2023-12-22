
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		
		int ans = 0;
		for (int i = 1; i < n; i++) {
			int count = 0;
			for (char c = 'a'; c <= 'z'; c++) {
				if (s.substring(0, i).contains(String.valueOf(c)) && s.substring(i).contains(String.valueOf(c))) {
					count++;
				}
			}
			ans = Math.max(ans, count);
		}
		System.out.println(ans);
	}
}