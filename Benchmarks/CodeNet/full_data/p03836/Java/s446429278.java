import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		int subx = tx - sx;
		int suby = ty - tx;

		StringBuilder sb = new StringBuilder(subx * 4 + suby * 4 + 4);

		// lap1
		for (int i = 0; i < suby; i++) {
			sb.append('U');
		}
		for (int i = 0; i < subx; i++) {
			sb.append('R');
		}
		for (int i = 0; i < suby; i++) {
			sb.append('D');
		}
		for (int i = 0; i < subx; i++) {
			sb.append('L');
		}

		// lap2
		sb.append('L');
		for (int i = 0; i < suby + 1; i++) {
			sb.append('U');
		}
		for (int i = 0; i < subx + 1; i++) {
			sb.append('R');
		}
		sb.append('D');
		sb.append('R');
		for (int i = 0; i < suby + 1; i++) {
			sb.append('D');
		}
		for (int i = 0; i < subx + 1; i++) {
			sb.append('L');
		}
		sb.append('U');

		System.out.println(sb.toString());

		sc.close();
	}

}
