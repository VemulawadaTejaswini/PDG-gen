import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[]A = new int[N];

		for (int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		int[] ASort = Arrays.copyOf(A, N);
		Arrays.sort(ASort);
		int max = ASort[N-1];
		int max2 = ASort[N-2];

		for (int i=0; i<N; i++){
			if (A[i] == max){
				System.out.println(max2);
			} else {
				System.out.println(max);
			}
		}
	}


}