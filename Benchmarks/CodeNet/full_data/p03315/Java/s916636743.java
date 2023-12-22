import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		for (char s : sc.next().toCharArray()) {
			if (s == '+') {
				ans++;
			} else {
				ans--;
			}
		}
		System.out.println(ans);
	}
}