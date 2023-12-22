import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] params = sc.nextLine().split(" ");
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(params[i]);
		}
		
		int ans = countSumZero(0, A);
		
		System.out.println(ans);
	}
	
	static int countSumZero(final int startIdx, int[] A) {
		long count = A[startIdx];
		int matchCount = 0;
		
		for (int i = startIdx + 1; i < A.length; i++) {
			count += A[i];
			
			if (count == 0) matchCount++;
		}
		
		if (startIdx + 1 < A.length) {
			matchCount += countSumZero(startIdx + 1, A);
		}
		
		return matchCount;
	}
 
}