import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int K = sc.nextInt();
		Long[] H = new Long[(int) (N)];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextLong();
		}
		Arrays.sort(H, Comparator.reverseOrder());
		long sum = 0;
		for (int i = K; i < H.length; i++) {
			sum += H[i];
		}
		System.out.println(Math.max(0, sum));


	}
}
