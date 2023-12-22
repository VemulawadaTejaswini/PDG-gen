import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[][] s = new char[3][];
		for (int i = 0; i < 3; i++) {
			s[i] = sc.next().toCharArray();
		}
		sc.close();

		int now = 0;
		int[] idx = new int[3];
		while (true) {
			if (idx[now] == s[now].length) {
				System.out.println((char) ('A' + now));
				return;
			}
			char next = s[now][idx[now]];
			idx[now]++;
			now = next - 'a';
		}
	}
}
