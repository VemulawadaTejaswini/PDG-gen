import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sx = in.nextInt();
		int sy = in.nextInt();
		int tx = in.nextInt();
		int ty = in.nextInt();
		in.close();
		int X = tx - sx;
		int Y = ty - sy;
		StringBuilder sb = new StringBuilder();

		//一回目のs→t
		for (int i = 0; i < Y; i++) {
			sb.append('U');
		}
		for (int i = 0; i < X; i++) {
			sb.append('R');
		}
		//一回目のt→s
		for (int i = 0; i < Y; i++) {
			sb.append('D');
		}
		for (int i = 0; i < X; i++) {
			sb.append('L');
		}

		//2回目のs→t
		sb.append('L');
		for (int i = 0; i < Y + 1; i++) {
			sb.append('U');
		}
		for (int i = 0; i < X + 1; i++) {
			sb.append('R');
		}
		sb.append('D');
		//2回目のt→s
		sb.append('R');
		for (int i = 0; i < Y + 1; i++) {
			sb.append('D');
		}
		for (int i = 0; i < X + 1; i++) {
			sb.append('L');
		}
		sb.append('U');

		System.out.println(sb);
	}
}
