import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		List<Long> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(in.nextLong());
		}
		in.close();
		
		Collections.sort(list);
		boolean[] is = new boolean[n];
		Arrays.fill(is, false);
		long[] sum = new long[n];
		
		sum[0] = list.get(0);
		for (int i = 1; i < n; i++) {
			sum[i] = sum[i - 1] + list.get(i);
		}
		
		int start = 0;
		for (int i = 1; i < sum.length; i++) {
			
			if(list.get(i) > 2 * sum[i - 1]) {
				start = i;
				break;
			}
		}
		System.out.println(n - start);
	}

}
