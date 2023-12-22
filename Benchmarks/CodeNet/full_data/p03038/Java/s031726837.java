import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i]=sc.nextInt();
		}

		int C[] = new int[M];
		int B[] = new int[M];
		int CB[] = new int[M];
		int tot = N;

		for (int i = 0; i < M; i++) {
			C[i] = sc.nextInt();
			B[i] = sc.nextInt();
			CB[i] =C[i] * B[i];
			tot += CB[i];
			}


	int AA[] = new int[tot];


	//    int[] A = new int[N];
//		int n = A.size();
//		int[] newA = new int[n];
//		for (int i=0; i<n;i++) {
//			newA[i] = A.get(i);
//		}



//		Collections.reverse(A);
//		System.out.println(A);
//		Collections.reverse(A);
		Arrays.sort(AA);
//		System.out.println(newA);
		long count = 0;
		for (int i = 0; i < N; i++) {
			count += AA[N-i-1];
		}
		System.out.println(count);
	}

}