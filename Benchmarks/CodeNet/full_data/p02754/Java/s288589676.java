import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out);) {
			long n = Long.parseLong(scan.next());
			long a = Long.parseLong(scan.next());
			long b = Long.parseLong(scan.next());

			long ta = a;
			long tb = b;
			long ret = 0;

			for (long cnt = 0; cnt < n; cnt++) {
				if (ta > 0) {
					ret++;
					ta--;
					continue;
				}
				if (tb > 0) {
					tb--;
					continue;
				}
				ta = a;
				tb = b;
				cnt--;
			}

			out.println(ret);
			out.flush();
		}
	}
}
