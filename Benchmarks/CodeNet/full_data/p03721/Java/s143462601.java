
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long K = scan.nextLong();
		int[] a = new int[N];
		int[] b = new int[N];
		long[] c = new long[100000];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}
		for(int i = 0; i < N; i++) {
			c[a[i] - 1] += b[i];
		}
		for(int i = 0; i < c.length; i++) {
			if(c[i] >= K) {
				System.out.println(i + 1);
				break;
			} else {
				K -= c[i];
			}
		}
		scan.close();
	}

}
