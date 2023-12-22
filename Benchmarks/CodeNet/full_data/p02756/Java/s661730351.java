import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer s = new StringBuffer(sc.next());
		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				s.reverse();
			} else {
				int f = sc.nextInt();
				String c = sc.next();

				if (f == 1) {
					s.insert(0, c);
				} else {
					s.append(c);
				}
			}
		}
		System.out.println(s);
	}

}
