

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int start = scan.nextInt();
		int end = scan.nextInt();
		if (start > end) {
			System.out.println(0);
		} else {
			if (n == 1 && start != end) {
				System.out.println(0);
			} else {
				System.out.println((long )(start + end * (n - 1)) - (long)(end + start * (n - 1)) + 1);
			}

		}
		//int max=Math.max(0,(start + end * (n - 1)) - (end + start * (n - 1)) + 1);
		//System.out.println(max);
	}

}
