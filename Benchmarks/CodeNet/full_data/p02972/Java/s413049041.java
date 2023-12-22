import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int[] a = new int[N];
		final int[] b = new int[N];
		
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = -1;
		}
		
		for (int i = N; i > 0; i--) {
			if (i > 2 / N) {
				b[i - 1] = a[i - 1];
				continue;
			}
			
			int rightSum = 0;
			for (int j = i * 2; j < N; j += i) {
				if (b[j] < 0) System.out.println("error");
				rightSum += b[j - 1];
			}
			
			int mod = rightSum % 2;
			if (mod == a[i - 1]) {
				b[i - 1] = 0;
			} else {
				b[i - 1] = 1;
			}
		}
		
		int balls = 0;
		for (int i = 0; i < N; i++) {
			balls += b[i];
		}
		
		System.out.println(balls);
		
		for (int i = 0; i < N; i++) {
			if (b[i] == 1) {
				System.out.print(i + 1);
				System.out.print(" ");
			}
		}
	}


}
