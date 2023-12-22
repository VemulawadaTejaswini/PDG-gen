import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int x = scanner.nextInt();
		int count = 0;
		int[] a = new int[N];
		for(int i=0; i<N;i++) {
			a[i] = scanner.nextInt();
			if(a[0]>x) {
				count += a[0]-x;
				a[0] = x;
			}
			if(i>=1) {
				if(a[i-1]+a[i]>x) {
					count += a[i-1]+a[i]-x;
					a[i] -= a[i-1]+a[i]-x;
				}
			}
		}
		System.out.println(count);
		scanner.close();
	}

}
