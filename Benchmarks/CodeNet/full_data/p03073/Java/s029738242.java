import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		int len = s.length;
		char[] c1 = new char[len];
		char[] c2 = new char[len];
		for (int i = 0; i < len; i = i + 2) {
			c1[i] = '0';
			c2[i] = '1';
		}
		for (int i = 1; i < len; i = i + 2) {
			c1[i] = '1';
			c2[i] = '0';
		}
		int dif1 = 0, dif2 = 0;
		for (int i = 0; i < len; i++) {
			if (s[i] != c1[i]) {
				dif1++;
			}
			if (s[i] != c2[i]) {
				dif2++;
			}
		}
		System.out.println(Math.min(dif1, dif2));
	}
}
