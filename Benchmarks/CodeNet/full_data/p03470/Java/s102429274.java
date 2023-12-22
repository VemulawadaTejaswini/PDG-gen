import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] d = new int[n];
		int i = 0;
		for(i = 0; i < n; i++) {
			d[i] = scan.nextInt();
		}
		Arrays.sort(d);
		int count = 1;
		for(i = 0; i < n - 1; i++) {
			if(d[i] < d[i + 1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}