import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		sc.close();

		StringBuilder sb = new StringBuilder();

		// 1回目行き
		int cnt = ty - sy;
		for (int i = 0; i < cnt; i++) {
			sb.append('U');
		}
		cnt = tx - sx;
		for (int i = 0; i < cnt; i++) {
			sb.append('R');
		}

		// 1回目戻り
		cnt = ty - sy;
		for (int i = 0; i < cnt; i++) {
			sb.append('D');
		}
		cnt = tx - sx;
		for (int i = 0; i < cnt; i++) {
			sb.append('L');
		}

		// 2回目行き
		sb.append('L');
		cnt = ty - sy + 1;
		for (int i = 0; i < cnt; i++) {
			sb.append('U');
		}
		cnt = tx - sx + 1;
		for (int i = 0; i < cnt; i++) {
			sb.append('R');
		}
		sb.append('D');

		// 2回目戻り
		sb.append('R');
		cnt = ty - sy + 1;
		for (int i = 0; i < cnt; i++) {
			sb.append('D');
		}
		cnt = tx - sx + 1;
		for (int i = 0; i < cnt; i++) {
			sb.append('L');
		}
		sb.append('U');

		System.out.println(sb.toString());
	}
}
