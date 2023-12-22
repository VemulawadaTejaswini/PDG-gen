import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
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
			System.out.println(((int)Math.pow(((N - 1) / 2), 2)) % (int)(Math.pow(10, 9) + 7));
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
			System.out.println((int)Math.pow((N / 2), 2) % (int)(Math.pow(10, 9) + 7));
			return;
		}
	}
}
