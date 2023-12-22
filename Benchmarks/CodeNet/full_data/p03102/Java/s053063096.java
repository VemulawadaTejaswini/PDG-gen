import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int result = 0;
		
		int[] B = new int[M];
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			int sum = C;
			for (int j = 0; j < M; j++) {
				int A = sc.nextInt();
				sum += A*B[j];
			}
			if (sum > 0) {
				result++;
			}
		}
		
    	System.out.println(result);
    }
  
}
