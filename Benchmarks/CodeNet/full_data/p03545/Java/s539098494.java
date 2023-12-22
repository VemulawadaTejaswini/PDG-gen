
import java.util.Scanner;

public class Main{
	static char get(char c) {
		if (c - '0' == 0)
			return '-';
		return '+';
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char m[] = sc.next().toCharArray();
		int n1 = m[0] - '0';
		int n2 = m[1] - '0';
		int n3 = m[2] - '0';
		int n4 = m[3] - '0';
		for (int i = 1; i < (1 << 3); i++) {
			char[] k = Integer.toBinaryString(8 + i).toCharArray();
			int ans = 0;
			ans = (k[2] - '0' == 1) ? n1 + n2 : n1 - n2;

			ans = (k[1] - '0' == 1) ? ans + n3 : ans - n3;

			ans = (k[0] - '0' == 1) ? ans + n4 : ans - n4;
			if (ans == 7) {
				System.out.println(n1 + "" + get(k[2]) + n2 + get(k[1]) + n3 + get(k[0]) + n4 + "=7");
				return;
			}

		}
	}

}
