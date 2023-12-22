import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		boolean hanten = false;
		StringBuffer sb = new StringBuffer(s);

		for (int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				hanten = !hanten;
			} else {
				if (!hanten) {
					sb = sb.reverse();
				}

				int f = sc.nextInt();
				String c = sc.next();
				if (f == 1) {
					sb = sb.insert(0, c);
				} else {
					sb.append(c);
				}
				hanten = false;
			}
		}

		if (!hanten) {
			sb = sb.reverse();
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
