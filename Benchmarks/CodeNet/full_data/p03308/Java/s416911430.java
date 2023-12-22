import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(A);
		System.out.println(Math.abs(A[0] - A[N-1]));
	}
}