import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt();
		sc.close();
		int ans = 0;
		for (int i = A; i <= B; i++) {
			String s = String.valueOf(i);
			char[] c = s.toCharArray();
			if (c[0] == c[4] && c[1] == c[3]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
