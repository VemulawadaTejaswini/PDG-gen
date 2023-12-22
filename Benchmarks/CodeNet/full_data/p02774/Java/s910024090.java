
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int  n    = Integer.parseInt(tmp[0]);
		int limit = n*(n-1)/2;
		long[] x  = new long[limit];
		int k     = Integer.parseInt(tmp[1]) - 1;

		String[] num = scanner.nextLine().split(" ");
		long[] list   = new long[n];

		for(int i = 0; i < n; i++)
			list[i] = Long.parseLong(num[i]);


		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				x[count] = list[i] * list[j];
				count++;
			}
		}

		Arrays.sort(x);

		System.out.println(x[k]);

	}
}