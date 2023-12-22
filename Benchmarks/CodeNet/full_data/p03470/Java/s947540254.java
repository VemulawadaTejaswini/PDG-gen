import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] mochi = new int[N];
		for (int i = 0; i < N ; i++) {
			mochi[i] = sc.nextInt();
		}
		Arrays.sort(mochi);

		int total = 1;
		for (int i = 0 ; i < N-1 ; i++) {
			if (mochi[i] < mochi[i+1]) {
				total += 1;
			}
			if (i+1 == N-1) {
				break;
			}
		}
		System.out.println(total);

	}
}
