import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[M];
		Arrays.setAll(A, i -> sc.nextInt());
		int left = 0;
		for(int i = 0; i < M; i++) {
			if(A[i] < X) {
				left++;
			} else {
				break;
			}
		}
		System.out.println(Math.min(left, M-left));
	}
}