import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for(int i = 0; i <= n; i++) a[i] = i;
		for(int i = 6; i <= n; i*= 6) {
			for(int j = i; j <= n; j++) {
				if(a[j] > a[j - i] + 1) a[j] = a[j - i] + 1;
			}
		}
		for(int i = 9; i <= n; i*= 9) {
			for(int j = i; j <= n; j++) {
				if(a[j] > a[j - i] + 1) a[j] = a[j - i] + 1;
			}
		}
		System.out.println(a[n]);
	}
}