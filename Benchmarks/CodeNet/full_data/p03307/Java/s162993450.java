import java.util.Arrays;
import java.util.Scanner;
public class Question102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}Arrays.sort(A);

		System.out.println(A[N-1]-A[0]);

	}

}
