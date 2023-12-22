import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int i = 0;
		while(true) {
			k -= b[i];
			if(k <= 0) {
				System.out.println(a[i]);
				return;
			}
			i++;
		}
	}
}
