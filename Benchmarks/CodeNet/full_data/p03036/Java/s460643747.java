import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int d = sc.nextInt();
		long x = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 10; i++) {
			x = r * x - d;
			sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
}
