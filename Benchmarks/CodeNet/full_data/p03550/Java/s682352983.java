import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N= sc.nextInt();
		long Z,W;
		Z=sc.nextLong();
		W=sc.nextLong();
		long a[]= new long[N];
		for (int i=0;i<N;i++) {
			a[i] =sc.nextLong();
		}
		int i=0;
		while (i<N) {
			for (;i<N;i++) {
				if (Z<a[i]) {
					Z=a[i];
					break;
				}
			}
			for (;i<N;i++) {
				if (W>a[i]) {
					W=a[i];
					break;
				}
			}
		}
		System.out.println(Math.abs(Z-W));
 	}
}