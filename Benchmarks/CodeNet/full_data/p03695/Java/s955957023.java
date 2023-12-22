import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] rate = new int[8];
		int red = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(3200 <= a) {
				red++;
			} else {
				rate[(a/400)]++;
			}
		}
		int min = 0;
		int max = 0;
		int count = 0;
		for(int i = 0; i < 8; i++) {
			if(rate[i] >= 1) {
				count++;
			}
		}
		min = Math.max(count, 1);
		max = count+red;
		System.out.println(min+" "+max);
	}
}