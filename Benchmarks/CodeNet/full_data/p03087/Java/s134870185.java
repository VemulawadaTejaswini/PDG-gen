import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		int[] l = new int[Q];
		int[] r = new int[Q];

		for (int i = 0; i < Q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		for (int i = 0; i < Q; i++) {
			String si = s.substring(l[i] - 1, r[i]);
			int count = 0;
			for (int j = 0; j < si.length() - 1; j++) {
				if (si.substring(j, j + 2).equals("AC")) {
					count++;
				}
			}

			System.out.println(count);
		}
	}
}