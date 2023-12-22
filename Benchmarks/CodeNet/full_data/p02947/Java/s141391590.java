import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str;
		String[] s = new String[n];
		long[] code = new long[n];
		long total;
		long count = 0;
		for (int i = 0; i < n; i++) {
			str = scan.next();
			char[] c = str.toCharArray();
			total = 0;
			for (int j = 0; j < c.length; j++) {
				total = total + (long) c[j];
			}
			code[i] = total;
		}
		Arrays.sort(code);
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (code[i] != code[j]) {
					break;
				}
				count++;
			}
		}
		System.out.println(count);
	}
}
