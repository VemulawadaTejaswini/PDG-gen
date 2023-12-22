import java.util.Scanner;

public class Main {
	
	static int matchCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] A = new int[N];
		A[0] = sc.nextInt();
		for (int i = 1; i < N; i++) {
			A[i] = sc.nextInt();
			countSumZero(i, A);
		}
		
		System.out.println(matchCount);
	}
	
	static void countSumZero(final int endIdx, int[] A) {
		long count = A[endIdx];
		
		for (int i = endIdx - 1; 0 <= i; i--) {
			count += A[i];
			
			if (count == 0) matchCount++;
		}
	}
 
}