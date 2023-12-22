import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		StringBuilder sb = new StringBuilder();
		if (n < m) {
			for (int i = 0; i < m; i++) {
				sb.append(n);
			}
		} else {
			for (int i = 0; i < n; i++) {
				sb.append(m);
			}
		}
		System.out.println(sb);
	}

}
