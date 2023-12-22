import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.next();

		int len = line.length();
		String[] s = new String[len];
		int[] re = new int[len];

		for (int i = 0; i < len; i++) {
			s[i] = line.substring(i, i + 1);
		}

		for (int i = 1; i < len - 1; i++) {
			if (s[i].equals("L")) {
				if (s[i - 1].equals("R")) {
					re[i]++;
					int back = i - 1;
					int countB = 0;
					while (s[back].equals("R")) {
						countB++;
						back--;
						if (back < 0) {
							break;
						}
					}
					re[i] += (countB / 2);

					if (s[i + 1].equals("L")) {
						int fo = i + 1;
						int countF = 0;
						while (s[fo].equals("L")) {
							countF++;
							fo++;
							if (fo >= len) {
								break;
							}
						}
						re[i] += (countF / 2);
					}
				}
			} else if (s[i].equals("R")) {
				if (s[i + 1].equals("L")) {
					re[i]++;
					int fo = i + 1;
					int countF = 0;
					while (s[fo].equals("L")) {
						countF++;
						fo++;
						if (fo >= len) {
							break;
						}
					}
					re[i] += (countF / 2);

					if (s[i - 1].equals("R")) {
						int back = i - 1;
						int countB = 0;
						while (s[back].equals("R")) {
							countB++;
							back--;
							if (back < 0) {
								break;
							}
						}
						re[i] += (countB / 2);
					}
				}
			}
		}


		for (int i = 0; i < len; i++) {
			System.out.print(i == 0 ? "" : " ");
			System.out.print(s[i]);
		}
		System.out.println();

		for (int i = 0; i < len; i++) {
			System.out.print(i == 0 ? "" : " ");
			System.out.print(re[i]);
		}
		System.out.println();

	}
}