import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (tmp <= a) {
				count1++;
			} else if (tmp <= b) {
				count2++;
			} else {
				count3++;
			}
		}
		System.out.println(Math.min(count1, Math.min(count2, count3)));
	}
}