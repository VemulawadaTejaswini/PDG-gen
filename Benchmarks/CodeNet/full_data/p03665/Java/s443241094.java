import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int[] a = new int[n];
		int even = 0;
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			if(a[i] % 2 == 0) even++;
		}
		if(n == even) {
			System.out.println(p == 0 ? 1L<<n : 0);
		} else {
			System.out.println(1L<<(n - 1));
		}
	}
}
