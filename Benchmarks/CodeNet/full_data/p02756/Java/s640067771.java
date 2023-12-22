
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		boolean hanten = false;
		StringBuffer sb = new StringBuffer(s);

		String mae = "";
		String ato = "";

		for (int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				hanten = !hanten;
			} else {
				if (!hanten) {
					sb = sb.insert(0, mae).append(ato);
					sb = sb.reverse();
				}

				int f = sc.nextInt();
				String c = sc.next();
				if (f == 1) {
					mae = c + mae;
				} else {
					ato = ato + c;
				}
				hanten = false;
			}
		}
		sb = sb.insert(0, mae).append(ato);
		if (!hanten) {
			sb = sb.reverse();
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
