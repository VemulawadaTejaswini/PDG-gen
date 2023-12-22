import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int h[] = new int[N];
		int diff = Integer.MAX_VALUE;

		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}

		Arrays.sort(h);

		for(int i = 0; i < h.length - K + 1; i++) {
			int temp = h[i + K - 1] - h[i];
			if(diff > temp) {
				diff = temp;
			}
		}


		System.out.println(diff);
	}
}