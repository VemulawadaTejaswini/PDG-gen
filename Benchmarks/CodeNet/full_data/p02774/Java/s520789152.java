import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		long[] ai = new long[n];
		long[] list = new long[n*(n-1)/2];
		for(int i = 0; i < n; i++) {
			long a = scan.nextInt();
			ai[i] = a;
		}
		int x = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				list[x] = ai[i] * ai[j];
				x++;
			}
		}
		Arrays.sort(list);
		System.out.println(list[k-1]);
		scan.close();
	}

}
