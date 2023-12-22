import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int T1 = 1;
		final int T2 = 2;

		final int F1 = 1;
		final int F2 = 2;

		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(s);

		int q = sc.nextInt();

		int isReversed = 1;

		for(int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if(t == T1) {
				isReversed *= -1;
			} else if(t == T2) {
				int f = sc.nextInt();
				String c = sc.next();

				if(f == F1) {
					if(isReversed == 1) {
						sb.insert(0, c);
					} else {
						sb.append(c);
					}

				} else if(f == F2) {
					if(isReversed == 1) {
						sb.append(c);
					} else {
						sb.insert(0, c);
					}
				}
			}
		}
		if(isReversed != 1) {
			sb.reverse();
		}
		System.out.println(sb.toString());
	}
}