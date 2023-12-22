import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int x = scan.nextInt();
		int a[] = new int[100];
		int cnt[] = new int[100];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			for(int k = 1; k <= d; k++) {
				if(k * a[i] + 1 <= d) {
					cnt[i]++;
				}
			}
		}
		int sum = 0;
		for(int i = 0; i < d; i++) {
			sum += cnt[i];
		}
		System.out.println(sum + n + x);
	}
}