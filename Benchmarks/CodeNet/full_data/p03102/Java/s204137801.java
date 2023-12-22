
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int codeNum = scan.nextInt();
		int num = scan.nextInt();
		int C = scan.nextInt();
		
		int[] B = new int[num];
		for (int i = 0; i < B.length; i++) {
			B[i] = scan.nextInt();
		}
		
		int[][] A = new int[codeNum][num];
		for (int i = 0; i < codeNum; i++) {
			for (int j = 0; j < num; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		
		int sum = 0;
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < num; j++) {
				sum += B[j] * A[i][j];
			}
			if (sum + C > 0) {
				count++;
			}
			sum = 0;
		}
		
		System.out.println(count);
		scan.close();
	}
}