
import java.util.Scanner;

public class Main {
	
	public static long ways(long sum, long[] A, int l, int r, long M) {
		long add;
		
		if(sum%M == 0) {
			add = 1;
		} else {
			add = 0;
		}
		
		if(r-l >= 1) {
			return (add + ways(sum - A[r], A, l, r-1, M));
		} else if(r-l == 0) {
			return (add);
		}
		return add;
	 	
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long M = scanner.nextInt();
		long sum=0;
		int l = 0;
		int r = N-1;
		long output = 0;
		long[] A = new long[N];
		
		for(int i = 0; i<N; i++) {
			A[i] = scanner.nextInt();
		}		
		
		for(int i=0; i<N; i++) {
			sum += A[i];
		}
		
		while(l<N) {
			output += ways(sum, A, l, r, M);
			sum = sum - A[l];
			l += 1;
		}
		
		System.out.println(output);
		
		
	}

}