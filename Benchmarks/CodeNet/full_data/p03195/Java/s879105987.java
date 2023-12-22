import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();
		if(N == 1) {
			if(a[0] % 2 == 0) {
				System.out.println("second");
			}else {
				System.out.println("first");
			}
			System.exit(0);
		}
		long t = a[0] ^ a[1];
		for(int i = 2; i < N; i++) {
			t = t ^ a[i];
		}
		if(t == 0) {
			System.out.println("second");
		}else {
			System.out.println("first");
		}
	}
}