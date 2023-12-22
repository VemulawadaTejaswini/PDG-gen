import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long k = sc.nextLong();
		sc.nextLine();
		String s = sc.nextLine();

		long cnt = 0;

		char a;
		char b;
		char c;

		for (int ai = 1; ai <= k-2; ai++) {
			for (int bi = ai + 1; bi <= k-1; bi++) {
				for (int ci = bi + 1; ci <= k; ci++) {
					if (bi - ai != ci - bi && ai < bi && bi < ci) {
						a = s.charAt(ai - 1);
						b = s.charAt(bi - 1);
						c = s.charAt(ci - 1);

						if (a != b && b != c && a != c) {
							cnt++;
						}
					}
				}
			}
		}

		System.out.println(cnt);
	}

}
