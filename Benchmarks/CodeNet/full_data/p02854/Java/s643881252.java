import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		long[] A = new long[(int)N];
		long sum = 0;
		for(int i = 0; i < N; i++) {
			A[i] = stdIn.nextLong();
			sum += A[i];
		}
		
		if(sum%2 == 0) {
			long x1 = 0;
			long x2 = 0;
			for(int i = 0; i < N; i++) {
				x1 += A[i];
				if(x1 == sum/2) {
					System.out.println(0);
					System.exit(0);
				}
				else if(x1 < sum/2 && x1+A[i+1] > sum/2) {
					x2 = x1+A[i+1];
					break;
				}
			}
			System.out.println(Math.min(sum-2*x1,2*x2-sum));
		}
		else {
			long x1 = 0;
			long x2 = 0;
			for(int i = 0; i < N; i++) {
				x1 += A[i];
				if(x1 < sum/2 && x1+A[i+1] > sum/2) {
					x2 = x1+A[i+1];
					break;
				}
			}
			System.out.println(Math.min(sum-2*x1,2*x2-sum));
		}

	}

}