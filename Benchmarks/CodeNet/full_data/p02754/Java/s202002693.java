import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out);) {
			int n = Integer.parseInt(scan.next());
			int a = Integer.parseInt(scan.next());
			int b = Integer.parseInt(scan.next());

			StringBuilder bld = new StringBuilder();
			while (bld.length() < n) {
				for (int cnt = 0; cnt < a; cnt++) {
					bld.append("b");
				}
				for (int cnt = 0; cnt < b; cnt++) {
					bld.append("r");
				}
			}

			String tmp = new String(bld).substring(0, n);
			int ret = 0;
			for (char c : tmp.toCharArray()) {
				if (c == 'b') {
					ret++;
				}
			}
			out.println(ret);
			out.flush();
		}
	}
}
