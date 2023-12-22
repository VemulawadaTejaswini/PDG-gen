import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] c = sc.next().toCharArray();
		long k = sc.nextLong();
		boolean b = true;
		int i = 0;
		for (; i < c.length; i++) {
			if (c[i] != '1') {
				b = false;
				break;
			}
		}
		if (b) {
			System.out.println(1);
		} else {
			if (k < i + 1) {
				System.out.println(1);
			} else {
				System.out.println(c[i]);
			}
		}
	}
}
