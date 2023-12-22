import java.util.*;
public class Main {
	public static void main(String[] a) {
		try (Scanner s = new Scanner(System.in)) {
			int sx = s.nextInt();
			int sy = s.nextInt();
			int tx = s.nextInt();
			int ty = s.nextInt();
			int dx = tx - sx;
			int dy = ty - sy;
			output(dx, 'R');
			output(dy, 'U');
			output(1, 'R');
			output(dy + 1, 'D');
			output(dx + 1, 'L');
			output(dy + 1, 'U');
			output(dx, 'R');
			output(1, 'U');
			output(dx + 1, 'L');
			output(dy + 1, 'D');
			output(1, 'R');
		}
	}
	static void output(int count, char c) {
		for (int i = 0; i < count; i++) {
			System.out.print(c);
		}
	}
}