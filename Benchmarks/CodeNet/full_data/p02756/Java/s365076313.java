import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		int q = Integer.parseInt(r.readLine());

		for (int i = 0; i < q; ++i) {
			String[] qs = r.readLine().split(" ");

			if (qs.length == 1) {
				StringBuilder sb = new StringBuilder(s);
				s = sb.reverse().toString();
			} else {
				int f = Integer.parseInt(qs[1]);
				String c = qs[2];

				if (f == 1) {
					StringBuilder sb = new StringBuilder(c);
					s = sb.append(s).toString();
				} else {
					StringBuilder sb = new StringBuilder(s);
					s = sb.append(c).toString();
				}
			}
		}

		System.out.println(s);

		r.close();
	}
}