import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		String s = sc.next();
		int q = sc.nextInt();

		//		String aaa = s;
		//
		//		for (int i = 1; i <= q; i++) {
		//			int tmp12 = sc.nextInt();
		//			if (tmp12 == 1) {
		//				aaa = rev(aaa);
		//				continue;
		//			}
		//			if (tmp12 == 2) {
		//				int tmp = sc.nextInt();
		//				if (1 == tmp) {
		//					aaa = sc.next() + aaa;
		//				} else {
		//					aaa += sc.next();
		//				}
		//			}
		//		}

		StringBuilder aaa = new StringBuilder(s);

		for (int i = 1; i <= q; i++) {
			int tmp12 = sc.nextInt();
			if (tmp12 == 1) {
				aaa.reverse();
				continue;
			}
			if (tmp12 == 2) {
				int tmp = sc.nextInt();
				if (1 == tmp) {
					aaa.insert(0, sc.next());
				} else {
					aaa.append(sc.next());
				}
			}
		}

		System.out.println(aaa);

	}

}
