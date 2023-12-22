import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out);) {
			long n = Long.parseLong(scan.next());
			long a = Long.parseLong(scan.next());
			long b = Long.parseLong(scan.next());

			long cnt = 0;
			long ret = 0;

			while (true) {

				cnt += a;
				ret += a;

				if (cnt >= n) {
					ret -= (cnt - n);
					break;
				}

				cnt += b;
				if (cnt >= n) {
					break;
				}
			}

			out.println(ret);
			out.flush();
		}
	}
}
