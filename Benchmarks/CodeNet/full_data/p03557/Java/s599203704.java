import java.util.Scanner;

public class Main {

	public static void main(String[] count) {

		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.next());

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(scan.next());
		}
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			B[i] = Integer.parseInt(scan.next());
		}
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = Integer.parseInt(scan.next());
		}

		
		scan.close();

		// start
		int result = 0;
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < C.length; j++) {
				for (int j2 = 0; j2 < C.length; j2++) {
					if (A[i] < B[j] && B[j] < C[j2]) {
						result ++;
					}
				}
			}
		}

		

		

		System.out.println(result);
	}

}
