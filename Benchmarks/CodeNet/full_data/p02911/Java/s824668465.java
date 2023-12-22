import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int K = sc.nextInt();
		int Q = sc.nextInt();
		for (int i=0;i<Q;i++) {
			int temp = sc.nextInt();
			A[temp-1]++;
		}
		for (int i=0;i<N;i++) {
			if (A[i]+K-Q>0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}