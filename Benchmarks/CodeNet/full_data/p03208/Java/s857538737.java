import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int[] heights = new int[n];

		for(int i = 0; i < n; i++) {
			heights[i] = scan.nextInt();
		}

		scan.close();

		Arrays.sort(heights);

		int minDiff = Integer.MAX_VALUE;
		for(int i = 0; i < n - k + 1; i++) {
			for(int j = 0; j < k; j++) {
				int max = heights[j+k -1];
				int min = heights[j];
				int diff = max - min;
				if(minDiff > diff) minDiff = diff;
			}
		}
		System.out.println(minDiff);
	}

}
