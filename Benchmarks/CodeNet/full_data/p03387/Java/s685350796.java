import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/**
	 * Main method.
	 */
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int[] ary = {a, b, c};
		
		int count = 0;
		
		Arrays.sort(ary);
		int max = calc_max(ary);
		int min = calc_min(ary);
		int median = ary[1];
		
		count += max - median;
		min += count;
		
		if ((max - min) % 2 == 0) {
			count += (max - min) / 2;
		} else {
			count += (max - min) / 2 + 2;
		}
		
		System.out.println(count);

	}

	public static int calc_max(int[] ary) {
		int max = ary[0];
		for (int i = 1; i < ary.length; i++) {
			max = Math.max(max, ary[i]);
		}
		return  max;
	}

	public static int calc_min(int[] ary) {
		int min = ary[0];
		for (int i = 1; i < ary.length; i++) {
			min = Math.min(min, ary[i]);
		}
		return  min;
	}
}
