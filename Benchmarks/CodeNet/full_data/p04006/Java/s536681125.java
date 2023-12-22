import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int x = scanner.nextInt();
		long a[] = new long[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		long time = 0;
		long maxshift = 0;
		a: for (int i = 0; i < a.length; i++) {
			long tem = a[i];
			int num = i;
			for (int j = 1; j < a.length; j++) {
				if (x * j > a[i] || x*j > tem ) {
					time = time + a[num];
				 	continue a;
				}
				long tt = a[(i - j + N) % N] + j * x;
				if (tem > tt) {
					maxshift = Math.max(maxshift, j);
					tem = tt;
					num = (i - j + N) % N;
				}
			}
			time = time + a[num];
		}
		time = time + x * maxshift;
		System.out.println(time);
	}

}