import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String string = sc.next();
		char c = ' ';
		int ans = 0;
		for (int i = 0; i < N; i++) {
			char target = string.charAt(i);
			if (c != target) {
				ans++;
				c = target;
			}
		}
		System.out.println(ans);
	}

}