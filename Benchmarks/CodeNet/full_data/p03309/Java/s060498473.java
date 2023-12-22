import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			A[i] -= i+1;
		}Arrays.sort(A);

		float amed = 0;
		if(N%2==0) {
			amed = A[N/2];
		}else {
			amed = (A[(N-1)/2] + A[(N+1)/2])/2;
		}

		int ans = 0;
		for(int j=0; j<N; j++) {
				ans += Math.abs(amed - A[j]);
		}

		System.out.println(ans);

	}

}
