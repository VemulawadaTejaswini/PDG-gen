import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int[] A = new int[3];
		int[] B = new int[3];
		Arrays.fill(A, 101);
		Arrays.fill(B, 101);
		String ans = "Yes";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = reader.nextInt();
				A[i] = Math.min(A[i], arr[i][j]);
				B[j] = Math.min(B[j], arr[i][j]);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] != A[i] + B[j]) {
					ans = "No";
				}
			}

		}


		System.out.print(ans);
		reader.close();
	}
}



