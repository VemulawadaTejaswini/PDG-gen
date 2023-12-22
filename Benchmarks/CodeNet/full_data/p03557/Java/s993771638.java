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

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		int count = 0;
		for (int b : B) {
			int i = Arrays.binarySearch(A, b);
			i = i >= 0 ? i : ~i;
			
			int j = Arrays.binarySearch(C, b);
			j = j >= 0 ? C.length - j - 1 : C.length - ~j;
			count += i * j;
		}
		System.out.println(count);
	}
}