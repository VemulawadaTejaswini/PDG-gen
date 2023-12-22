//ABC140 B
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		int C[] = new int[N];
		int sum = 0;
		int i = 0;
		int k = 0;
		for(i=0;i<N;i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}

		for(k=0;k<N-1;k++) {
			C[k] = sc.nextInt();
		}

		for(int j=0;j<N;j++) {
			sum += B[A[j]-1];
			if(A[j+1]-A[j]==1) {
				sum+= C[j];
			}
		}

		System.out.println(sum);


	}

}