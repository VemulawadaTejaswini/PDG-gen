import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sa = scan.next();
		String sb = scan.next();
		String sc = scan.next();

		char flag = 'a';

		int a_count = 0, b_count = 0, c_count = 0;

		while (true) {
			if (flag == 'a') {
				if (a_count == sa.length()) {
					System.out.print("A");
					break;
				}
				flag = sa.charAt(a_count);
				a_count++;
			}

			if (flag == 'b') {
				if (b_count == sb.length()) {
					System.out.print("B");
					break;
				}
				flag = sb.charAt(b_count);
				b_count++;
			}

			if (flag == 'c') {
				if (c_count == sc.length()) {
					System.out.print("C");
					break;
				}
				flag = sc.charAt(c_count);
				c_count++;
			}
		}

	}
}
