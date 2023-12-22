
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long A[] = new long[T];
		long B[] = new long[T];
		long C[] = new long[T];
		long D[] = new long[T];
		for (int i = 0; i < T; i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
			C[i] = sc.nextLong();
			D[i] = sc.nextLong();
		}
		for (int i = 0; i < T; i++) {
			Long AA = A[i];
			Long BB = B[i];
			Long CC = C[i];
			Long DD = D[i];
			boolean JG = true;
			if (AA < BB || DD < BB) {
				JG = false;
			} else if (CC >= BB) {
				JG = true;
			} else {
				Set<Long> set = new HashSet<>();
				Long A1 = AA % BB;
				set.add(A1);
				if (A1 > CC) {
					JG = false;
				} else {
					Long D2 = DD % BB;
					A1 += D2;
					while (true) {
					
						if (A1 >= BB) {
							A1 -= BB;
						}
						if (A1 > CC) {
							JG = false;
							break;
						} else {
							if (D2 == 0) {
								JG = true;
								break;
							}
							long k = (BB - A1) / D2;
							if (BB - A1 - D2 * k < BB - CC
									&& BB - A1 - D2 * k > 0) {
								JG = false;
								break;
							} else {
								A1 = A1 +( D2 * (k + 1)) - BB;
								if (set.contains(A1)) {
									JG = true;
									break;
								} else {

									set.add(A1);
								}
							}
						}
					}
				}
			}
			if (JG) {
				System.out.println("Yes");

			} else {
				System.out.println("No");

			}
		}

	}
}