import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		Integer[] item = new Integer[n];
		
		double sum = 0;
		for(int i = 0 ; i < n ; i++) {
			item[i] = Integer.parseInt(sc.next());
			sum += item[i];
		}

		Arrays.sort(item, Collections.reverseOrder());

		String ans = "Yes";
		if((double)item[m-1] < (double)sum / (double)(4 * m)) {
			ans = "No";
		}

		System.out.println(ans);

	}
}
