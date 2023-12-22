import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		switch (d) {
		case (0):
			for (int i = 1; i <= n; i++) {
				if (i / 100 == 0) {
					a[i - 1] = i;
				}else {
					a[i - 1] = i+1;
				}
			}
			System.out.println(a[n - 1]);
			break;
		case (1):
			for (int i = 1; i <= n; i++) {
				if (i / 100 == 0) {
					a[i - 1] = i;
				}else {
					a[i - 1] = i+1;
				}
			}
			System.out.println(a[n - 1]*100);
			break;
		case (2):
			for (int i = 1; i <= n; i++) {
				if (i / 100 == 0) {
					a[i - 1] = i;
				}else {
					a[i - 1] = i+1;
				}
			}
			System.out.println(a[n - 1]*10000);
			break;
		}
	}
}
