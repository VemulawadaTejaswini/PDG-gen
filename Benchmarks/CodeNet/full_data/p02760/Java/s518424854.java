import java.util.Scanner;

public class Main {

	public static boolean column(boolean T[][]) {
		for (int i = 0; i < 3; i++) {
			if (T[i][0] == true && T[i][1] == true && T[i][2] == true) {
				return true;
			}
		}
		return false;

	}

	public static boolean row(boolean T[][]) {
		for (int i = 0; i < 3; i++) {
			if (T[0][i] == true && T[1][i] == true && T[2][i] == true) {
				return true;
			}
		}
		return false;

	}

	public static boolean dia(boolean T[][]) {
		if ((T[0][0] == true && T[1][1] == true && T[2][2] == true)
				|| ((T[0][2] == true && T[1][1] == true && T[2][0] == true))) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		int A[][] = new int[3][3];
		boolean T[][] = new boolean[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				T[i][j] = false;
			}
		}
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int N = sc.nextInt();
		int count = 0;
		while (count < N) {
			int b = sc.nextInt();
			out: for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (A[i][j] == b) {
						T[i][j] = true;
						break out;
					}

				}
			}
			count++;
		}

		boolean bo = false;
		//		if (N > 6) {
		//			bo = true;
		//		} else {
		//縦
		bo = column(T);
		//横
		bo = row(T);
		//斜め
		bo = dia(T);
		//		}
		if (bo == false) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}
}
