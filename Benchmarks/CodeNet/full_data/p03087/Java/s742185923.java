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

			String si = s.substring(l[i] - 1, r[i]);

			int acCount = 0;
			int index = si.indexOf("AC", 0);
			while (index != -1) {
				acCount++;
				index = si.indexOf("AC", index + 1);
			}
			System.out.println(acCount);
		}

	}
}