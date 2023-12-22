import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		//    int[] A = new int[N];
		List<Integer> A = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}

		int C = 0;
		int B = 0;

		for (int i = 0; i < M; i++) {
			C = sc.nextInt();
			B = sc.nextInt();
			for (int j = 0; j < C; j++) {
				A.add(B);
			}
		}

		int n = A.size();
		int[] newA = new int[n];
		for (int i=0; i<n;i++) {
			newA[i] = A.get(i);
		}



//		Collections.reverse(A);
//		System.out.println(A);
//		Collections.reverse(A);
		Arrays.sort(newA);
//		System.out.println(newA);
		long count = 0;
		for (int i = 0; i < N; i++) {
			count += newA[n-i-1];
		}
		System.out.println(count);
	}

}