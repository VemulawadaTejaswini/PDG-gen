import java.util.Scanner;

public class Main {
	public static int N;
	public static int[] A;

	public static void main(String[] args) {
		init();
		boolean ans = true;
		for (int i = 0; i < A.length; i++) {
			if ((A[i] % 2 == 0) && (A[i] % 3 != 0 && A[i] % 5 != 0)) {
				System.out.println("DENIED");
				ans = false;
				break;
			}
		}
		if (ans) {
			System.out.println("APPROVED");
		}
	}

	public static void init() {
		Scanner sc = new Scanner(System.in);
		try {
			N = sc.nextInt();
			A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
