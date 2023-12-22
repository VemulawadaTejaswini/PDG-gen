import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		
		int x = 0;
		int y = 0;
		
		for(int i = N - 1; i >= 1; i--) {
			if(A[i] == A[i - 1]) {
				if(x == 0) {
					x = A[i];
					i--;
				} else {
					y = A[i];
					break;
				}
			}
		}
		long S = x * y;
		System.out.println(S);
	}
}
