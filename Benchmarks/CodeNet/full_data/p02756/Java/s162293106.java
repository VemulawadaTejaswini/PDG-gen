import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		String mae = "";
		String ato = "";
		int zenkai = 0;

		StringBuffer sb = new StringBuffer(s);
		for (int i = 0; i < q; i++) {
			int t = sc.nextInt();

			if (t == 1) {
				if (zenkai != t) {
					if (mae == "") {
						sb = sb.insert(0, mae);
					}
					if (ato == "") {
						sb = sb.append(ato);
					}
					sb = sb.reverse();
					mae = "";
					ato = "";
				}

			} else {
				int f = sc.nextInt();
				String c = sc.next();
				if (f == 1) {
					mae = c + mae;
				} else {
					ato = ato + c;
				}
			}
			zenkai = t;

		}
		sb = sb.insert(0, mae).append(ato);
		System.out.println(sb.toString());
		sc.close();
	}
}