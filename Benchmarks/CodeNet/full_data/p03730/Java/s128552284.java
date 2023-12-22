
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = 0;
		outside: for (int i = 1;; i++) {
			for (int j = 1;; j++) {
				if (a * i == b * j) {
					max = i;
					break outside;
				}
				if (a * i < b * j) break;
			}
		}
		
		int sum = 0;
		String ans = "NO";
		for (int i = 1; i <= max; i++) {
			sum += a * i;
			if (sum % b == c) {
				ans ="YES";
				break;
			}
		}
		
		System.out.println(ans);
	}
}