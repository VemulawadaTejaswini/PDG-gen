

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		boolean f = false;

		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			if (A[i] % 2 == 0) {
				if (A[i]%3 != 0 && A[i]%5 != 0) {
					f = true;
				}
			}
		}

		if (f) {
			System.out.println("DENIED");
		} else {
			System.out.println("APPROVED");
		}

	}
}
