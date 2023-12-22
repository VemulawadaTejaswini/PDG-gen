import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a[] = new int[200010];
		int ans[] = new int[200010];
		int n  =scan.nextInt();

		for(int i = 2; i <= n; i++) {
			a[i] = scan.nextInt();
		}
		for(int i = 2; i <= n; i++) {
			ans[a[i]]++;
		}
		for(int i = 1; i <= n; i++) {
			System.out.println(ans[i]);
		}


	}
}