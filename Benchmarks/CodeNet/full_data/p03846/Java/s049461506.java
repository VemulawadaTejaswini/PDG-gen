import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A[] = new long[(int)N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		if(A[0] == 0) {
			for(int i = 0; i < N; i++) {
				if(i % 2 == 0) {
					if(A[i] != i) {
						System.out.println(0);
						return;
					}
				} else {
					if(A[i] != i + 1) {
						System.out.println(0);
						return;
					}
				}
			}
			System.out.println(((long)Math.pow(((N - 1) / 2), 2)) % (long)(Math.pow(10, 9) + 7));
			return;
		} else {
			for(int i = 0; i < N; i++) {
				if(i % 2 == 0) {
					if(A[i] != i + 1) {
						System.out.println(0);
						return;
					}
				} else {
					if(A[i] != i) {
						System.out.println(0);
						return;
					}
				}
			}
			System.out.println((long)Math.pow((N / 2), 2) % (long)(Math.pow(10, 9) + 7));
			return;
		}
	}
}
