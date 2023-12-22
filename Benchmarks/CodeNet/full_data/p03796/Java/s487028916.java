
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = (ans * i) % 1000000007;
		}

		System.out.println(ans);
	}
}