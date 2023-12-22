import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int[] height = new int[N];
		
		for (int i = 0; i < N; i++) {
			height[i] = scan.nextInt();
		}
		
		Arrays.sort(height);
		
		int count = 0;
		for (int i = 0; i < height.length; i++) {
			if (height[i] >= K) {
				count++;
			}
		}
		System.out.println(count);
	}
}
