import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Q = sc.nextInt();

		for (int i = 0; i < Q; i++) {
			int Ti = sc.nextInt();
			if (Ti == 2) {
				int Fi = sc.nextInt();
				String Ci = sc.next();
				if (Fi == 1) {
					S = Ci + S;
				} else {
					S = S + Ci;
				}
			} else {
				StringBuffer str = new StringBuffer(S);
				S = str.reverse().toString();

			}
		}
		sc.close();
		System.out.println(S);
	}
}
