import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		long A[] = new long[N];

		for (int i=0; i<N; i++){
			A[i] = sc.nextLong();
		}
		ArrayList<Long>ans = new ArrayList<Long>();

		for (int i=0; i<N; i++){
			for (int j= i+1 ; j<N; j++){
				ans.add(A[i] * A[j]);
			}
		}
		Collections.sort(ans);
		System.out.println(ans.get(K-1));
	}
}