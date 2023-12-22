import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'x') {
				cnt++;
			}
		}
		if (cnt >= 8) {
			sb.append("NO");
		} else {
			sb.append("YES");
		}
		System.out.println(sb);
	}
}
