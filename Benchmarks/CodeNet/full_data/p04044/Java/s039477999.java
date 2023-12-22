import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int n = scan.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = scan.next();
		}

		Arrays.sort(s);
		for (int i = 0; i < n; i++) {
			System.out.print(s[i]);
		}
	}

}