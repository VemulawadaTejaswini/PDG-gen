import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N + 1];
		int[] b = new int[N];
		for(int i = 0; i < N + 1; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < N; i++) {
			if(a[i] <= b[i]) {
				sum += a[i];
				b[i] -= a[i];
				if(a[i + 1] <= b[i]) {
					sum += a[i + 1];
					a[i + 1] = 0;
				}else {
					sum += b[i];
					a[i + 1] -= b[i];
				}
			}else {
				sum += b[i];
			}
		}
		System.out.println(sum);
	}

}
