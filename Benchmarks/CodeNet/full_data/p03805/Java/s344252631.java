import java.util.Scanner;

public class Main {
	static boolean[][] connected;
	static boolean[] arrived;
	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		// make a map
		connected = new boolean[n][n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1; // start at 0
			int b = sc.nextInt() - 1;
			connected[a][b] = true;
			connected[b][a] = true;
		}

		arrived = new boolean[n];
		serch(arrived, 0);

		System.out.println(ans);

		sc.close();
	}

	// serch
	static void serch(boolean[] arrived, int arrive) {
		if (arrived[arrive]) {
			return;
		} else {
			arrived[arrive] = true;
		}

		if (isAccomplish(arrived)) {
			ans++;
			return;
		}

		for (int i = 0; i < connected.length; i++) {
			if (connected[arrive][i]) {
				serch(copyArray(arrived), i);
			}
		}
	}

	// copy a array
	static boolean[] copyArray(boolean[] arr1) {

		boolean[] arr2 = new boolean[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		return arr2;
	}

	// check accomplish
	static boolean isAccomplish(boolean[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i]) {
				return false;
			}
		}
		return true;
	}

}
