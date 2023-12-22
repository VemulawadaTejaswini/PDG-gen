import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B  = new int[N];
		int[] C = new int[N];
		
		for (int i = 0; i < N; i++) A[i] = sc.nextInt();
		for (int i = 0; i < N; i++) B[i] = sc.nextInt();
		for (int i = 0; i < N; i++) C[i] = sc.nextInt();
		
		int count = 0;
		for (int b : B) {
			int a = Arrays.binarySearch(A, b);
			if (a < 0) {
				a = ~a;
			} else {
				a--;
			}
			//System.out.println(a);
			//System.out.println();
			int c = Arrays.binarySearch(C, b);
			if (c < 0) {
				c = C.length - ~c;
			} else {
				c = C.length - c - 1;
			}
			count += a * c;
		}
		System.out.println(count);		
	}
}