import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = sc.nextLong();
		long A[] = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		long count =0;
		for (int i=1;i<N;i++) {
			if(A[i]+A[i-1]>x) {
				long temp = A[i]+A[i-1]-x;
				count +=temp;
				if (A[i-1]>x) {
					A[i] =0;
				} else {
					A[i]-=temp;
				}

			}
		}
		System.out.println(count);
	}
}