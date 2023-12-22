import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		StringBuffer S = new StringBuffer(scan.next());
		int Q = scan.nextInt();

		for (int i = 0; i < Q; i ++) {
			int t = scan.nextInt();

			if (t == 1) {
				S.reverse();
			} else {
				int f = scan.nextInt();
				String c = scan.next();

				if (f == 1) {
					S.insert(0, c);
				} else {
					S.insert(S.length(), c);
				}
			}
		}

		System.out.println(S);

	}

}