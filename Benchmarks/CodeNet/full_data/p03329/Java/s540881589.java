import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static int n = 0;
	static long list[];
	static int index = 0;

	public static void main(String[] args) {


		n = scan.nextInt();
		list = new long[(int) n];
		list[n - 1] = 1;

		max(9);
		max(6);
		Arrays.sort(list);
		int h = n;
		int ans = 0;
		for(int i = 1; i < h;) {
			if(n - list[h - i] >= 0) {
				System.out.print(n + " - " + list[h - i] + " = ");
				ans++;
				n -= list[h - i];
				System.out.println(n);
			} else {
				i++;
			}
			if(n == 0) break;
		}
		System.out.println("Ans = " + ans);
	}

	static void max(int p) {
		long max = 0;
		while(Math.pow(p, max + 1) <= n) {
			max++;
			list[index] = (long) Math.pow(p, max);
			index++;
		}
		max++;
		list[index] = (long) Math.pow(p, max);
		index++;
	}
}
