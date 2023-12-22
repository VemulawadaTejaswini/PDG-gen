import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(br);
		PrintWriter out = new PrintWriter(System.out);

		String s;
		int x, y;
		for (;in.hasNextLine();) {
			s = in.nextLine().trim().toUpperCase();
			x = 0;
			y = 0;
			int n = s.length();
			boolean b = false;
			for (int i = 0; i < n; i++) {
				switch (s.charAt(i)) {
				case 'S':
					y--;
					break;
				case 'N':
					y++;
					break;
				case 'W':
					x++;
					break;
				case 'E':
					x--;
					break;
				}

				if (x == 0 && y == 0) {
					b = true;
					break;
				}
			}
			out.println(b ? "YES" : "NO");
		}

		out.close();
		in.close();
	}
}