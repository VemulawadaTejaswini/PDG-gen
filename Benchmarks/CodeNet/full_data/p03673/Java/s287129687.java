import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] s = new int[440000];
		int[] t = new int[220000];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int left = 220000; int right = left + 1;
		for(int i = 0 ; i < n ; i++) {
			if((n + 1) % 2 == i % 2) {
				s[left--] = a[i];
			} else {
				s[right++] = a[i];
			}
		}
		for(int i = left ; i <= right ; i++) {
			t[i - left] = s[i];
		}
		for(int i = 1 ; i < n + 1 ; i++) {
			System.out.print(t[i] + " ");
		}
	}
}
