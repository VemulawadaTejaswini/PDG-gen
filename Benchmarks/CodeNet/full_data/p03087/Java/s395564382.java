import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Q = scanner.nextInt();
		String S = scanner.next();
		int[] l = new int[Q];
		int[] r = new int[Q];
		for (int i = 0; i < Q; i++) {
			l[i] = scanner.nextInt();
			r[i] = scanner.nextInt();
		}

		for (int i = 0; i < Q; i++) {
			String s = S.substring(l[i] - 1, r[i]);

			int count = 0;
			for (int j = 0; j < s.length() - 1; j++) {
				if ("AC".equals( s.substring(j, j + 2))) {
					count++;
					j++;
				}
			}

			System.out.println(count);
		}
	}
}