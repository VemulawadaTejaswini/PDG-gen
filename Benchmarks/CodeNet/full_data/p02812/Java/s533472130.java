import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		char[] s = sc.nextLine().toCharArray();
		char[] a = new char[]{'A', 'B', 'C'};
		long answer = 0;

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < 3 && i + j < s.length; j++) {
				if (s[i + j] != a[j]) break;
				if (j == 2) answer++;
			}
		}

		System.out.println(answer);
	}
}
