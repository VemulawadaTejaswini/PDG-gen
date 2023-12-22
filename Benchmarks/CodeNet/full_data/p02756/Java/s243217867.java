import java.util.Scanner;

public class　Main {

	public static void main(String[] args) {
		String S;
		int Q;
		int T;
		int F;
		String J;
		int i;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		Q = Integer.parseInt(sc.next());
		StringBuilder str = new StringBuilder(S);
		for (i = 0; i < Q; i++) {
			T = Integer.parseInt(sc.next());
			if (T == 1) {
				str.reverse();
			} else {
				F = Integer.parseInt(sc.next());
				J = sc.next();
				if (F == 1) {
					str.insert(0, J);
				} else {
					str.insert(str.length(), J);
				}
			}
		}
		System.out.println(str);
		sc.close();
	}
}