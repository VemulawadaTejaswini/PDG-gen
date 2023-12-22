import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// int N = 3;
		// int[] A = { 24, 16, 24 };

		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.next());

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(scan.next());
		}

		scan.close();

		int i = 0;
		boolean volid = true;
		while (true) {
			for (int j = 0; j < A.length; j++) {
				if (A[j] % 2 != 0) {
					volid = false;
					break;
				}
				A[j] = A[j] / 2;
			}
			if (!volid) {
				break;
			}
			i += 1;
		}
		System.out.println(i);
	}

}
