import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[] updown = new char[w + 2];
		Arrays.fill(updown, '#');
		StringBuilder sb = new StringBuilder();
		sb.append(updown).append("\n");
		for (int i = 0; i < h; i++) {
			sb.append("#").append(sc.next()).append("#").append("\n");
		}
		sb.append(updown).append("\n");
		System.out.print(sb);
	}
}
