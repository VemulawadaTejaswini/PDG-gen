import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
 		Integer Size[] = new Integer[N];
 		for (int i = 0; i < N; i++) {
 			Size[i] = scanner.nextInt();
 		}
 		Arrays.sort(Size, Collections.reverseOrder());
 		for (int j = 0; j < N; j++) {
 			if (Size[j] < K) {
 				System.out.println(j);
 				break;
 			}
 		}
 		if (Size[N - 1] >= K) {
				System.out.println(N);
		}
	}
}