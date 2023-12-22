import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		int tx = 0;
		int ty = 0;
		int dx = 1;
		int dy = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("F")) {
				tx += dx;
				ty += dy;
			}
			else {
				if (dx != 0) {
					dx = 0;
					if (ty < y)
						dy = 1;
					else
						dy = -1;
				}
				else {
					dy = 0;
					if (tx < x)
						dx = 1;
					else
						dx = -1;
				}
			}
		}
		if (tx == x && ty == y)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}