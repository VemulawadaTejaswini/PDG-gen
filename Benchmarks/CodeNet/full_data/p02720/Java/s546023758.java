

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = Integer.parseInt(sc.next());

		ArrayList<Long> l = new ArrayList<>();

		for (long i = 1; i < 10; i++) {
			l.add(i);
		}

		loop2: for (long i = 1; i < 10; i++) {
			for (long j = i - 1; j <= i + 1; j++) {
				if (j == 10) {
					break loop2;
				}
				l.add(10 * i + j);
			}
		}

		loop3: for (long i = 1; i < 10; i++) {
			for (long j = i - 1; j <= i + 1; j++) {
				if (j == 10)
					break loop3;

				for (long m = j - 1; m <= j + 1; m++) {
					if (m == -1 || m == 10) {
						continue;
					}

					l.add(i * 100 + j * 10 + m);
				}
			}
		}

		loop4: for (long a1 = 1; a1 < 10; a1++) {
			for (long a2 = a1 - 1; a2 <= a1 + 1; a2++) {
				if (a2 == 10)
					break loop4;

				for (long a3 = a2 - 1; a3 <= a2 + 1; a3++) {
					if (a3 == -1 || a3 == 10) {
						continue;
					}
					for (long a4 = a3 - 1; a4 <= a3 + 1; a4++) {
						if (a4 == -1 || a4 == 10) {
							continue;
						}

						l.add(a1 * 1000 + a2 * 100 + a3 * 10 + a4);
					}
				}
			}
		}

		loop5: for (long a1 = 1; a1 < 10; a1++) {
			for (long a2 = a1 - 1; a2 <= a1 + 1; a2++) {
				if (a2 == 10)
					break loop5;

				for (long a3 = a2 - 1; a3 <= a2 + 1; a3++) {
					if (a3 == -1 || a3 == 10) {
						continue;
					}
					for (long a4 = a3 - 1; a4 <= a3 + 1; a4++) {
						if (a4 == -1 || a4 == 10) {
							continue;
						}
						for (long a5 = a4 - 1; a5 <= a4 + 1; a5++) {
							if (a5 == -1 || a5 == 10) {
								continue;
							}

							l.add(a1 * 10000 + a2 * 1000 + a3 * 100 + a4 * 10 + a5);
						}
					}
				}
			}
		}

		System.out.println(l.get(k));
	}

}
