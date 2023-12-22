import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long A[] = new long[N];
		
		for (int i=0; i<N; i++) {
			A[i] = sc.nextLong();
		}
		
		ArrayList<Long> B = new ArrayList<>();
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				Long tmp = A[i]*A[j];
				B.add(tmp);
			}
		}
		
		Collections.sort(B);
		

		System.out.println(B.get(K-1));

	}
}