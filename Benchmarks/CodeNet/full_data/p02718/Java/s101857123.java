import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N;
		int M;
		int temp;
		int sum = 0;
		int P;
		ArrayList<Integer> A = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int i;
		for (i = 0; i < N; i++) {
			temp = sc.nextInt();
			A.add(temp);
			sum += temp;
		}
		Collections.sort(A, Collections.reverseOrder());
		P = A.get(M - 1);
		if ((double) sum / 4 / M > P) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		sc.close();
	}

}