import java.util.Scanner;

public class APC001B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		long asum = 0;
		long bsum = 0;
		for(int i = 0;i < N;i++) {
			a[i] = sc.nextInt();
			asum += a[i];
		}
		for(int i = 0;i < N;i++) {
			b[i] = sc.nextInt();
			bsum += b[i];
		}
		sc.close();
		System.out.println(bsum - asum == N ? "Yes" : "No");
	}
}