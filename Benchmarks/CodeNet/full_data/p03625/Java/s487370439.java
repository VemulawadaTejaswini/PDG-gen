import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int longer = 0;
		int shorter = 0;
		int shorter_comming = 0;
		int current = 0;
		for(int i=N-1; 0<=i; i--) {
			if(shorter_comming == 0) {
				if(current == A[i]) {
					longer = A[i];
					shorter_comming = 1;
					current = 0;
				} else {
					current = A[i];
				}
			} else {
				if(current == A[i]) {
					shorter = A[i];
					break;
				} else {
					current = A[i];
				}
			}
		}
		System.out.println(shorter * longer);
	}
}
