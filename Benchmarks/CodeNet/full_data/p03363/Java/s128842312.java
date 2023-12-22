import java.util.Scanner;

public class Main {
	
	static int matchCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] params = sc.nextLine().split(" ");
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(params[i]);
		}
		
		int end = A.length - 1;
		for (int i = 0; i < end; i++) {
			countSumZero(i, A);
		}
		
		System.out.println(matchCount);
	}
	
	static void countSumZero(final int startIdx, int[] A) {
		long count = A[startIdx];
		
		for (int i = startIdx + 1; i < A.length; i++) {
			count += A[i];
			
			if (count == 0) matchCount++;
		}
	}
 
}