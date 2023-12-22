import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] s = new String[n];
		int[] p = new int[n];
		int[] o = new int[n];

		int num = n;
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			p[i] = sc.nextInt();
			o[i] = num--;
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (s[i].compareTo(s[j]) > 0) {
					String tmps = s[j];
					s[j] = s[i];
					s[i] = tmps;
					int tmpp = p[j];
					p[j] = p[i];
					p[i] = tmpp;
					int tmpo = o[j];
					o[j] = o[i];
					o[i] = tmpo;
				}
				if (s[i].equals(s[j])) {
					if (p[i] > p[j]) {
						int tmpp = p[j];
						p[j] = p[i];
						p[i] = tmpp;
						int tmpo = o[j];
						o[j] = o[i];
						o[i] = tmpo;
					}
				}
			}

		}

		for (int i = 0; i < n; i++) {
			//			System.out.println(s[i] + " " + p[i]);
			System.out.println(o[i]);
		}
		sc.close();
	}
}