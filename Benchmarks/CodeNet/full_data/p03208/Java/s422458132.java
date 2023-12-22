import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		int[] h = new int[N];
		for(int i = 0;i < N;i++) {
			h[i] = s.nextInt();
		}
		Arrays.sort(h);
		int min = Integer.MAX_VALUE;
		for(int i = 0;i < N-K+1;i++) {
			min = Math.min(min, h[i+2]-h[i]);
		}
		System.out.println(min);
	}

}
