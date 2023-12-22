import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		String[] t = s.split("T");
		if (t.length == 0) {
			if (s.length() == x && y == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
			return;
		}
		String[] sx = new String[(t.length + 1) / 2 - 1];
		String[] sy = new String[t.length / 2];
		for (int i = 0; i < t.length; i++) {
			if (i % 2 == 0 && i != 0)
				sx[i / 2 - 1] = t[i];
			else if (i != 0)
				sy[i / 2] = t[i];
		}
		boolean able = false;
		int digit = sx.length;
		for(int i = 0; i < (1<<digit); i++) {
			int d = t[0].length();
			for(int j = digit - 1, k = 0; j >= 0; j--, k++) {
				if(((i>>j) & 1) == 1)
					d += sx[k].length();
				else
					d -= sx[k].length();
			}
			if (d == x) {
				able = true;
				break;
			}
		}
		if (!able) {
			System.out.println("No");
			return;
		}
		able = false;
		digit = sy.length;
		for(int i = 0; i < (1<<digit); i++) {
			int d = 0;
			for(int j = digit - 1, k = 0; j >= 0; j--, k++) {
				if(((i>>j) & 1) == 1)
					d += sy[k].length();
				else
					d -= sy[k].length();
			}
			if (d == y) {
				able = true;
				break;
			}
		}
		if (able)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}