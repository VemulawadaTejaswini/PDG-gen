import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		int semi = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] >= max) {
				semi = max;
				max = a[i];
			} else if (a[i] >= semi) {
				semi = a[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (a[i] == max) {
				System.out.println(semi);
			} else {
				System.out.println(max);
			}
		}
	}
}