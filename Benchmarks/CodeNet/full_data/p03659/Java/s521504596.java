import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] cords = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			cords[i] = sc.nextInt();
			sum += cords[i];
		}

		int sum2 = cords[0];
		int X;
		int Y;
		int ans = 0;
		int itijikai = 0;

		for(int m = 0;m < N - 1;m++) {
			if(m != 0) {
				sum2 += cords[m];
			}
			X = sum2;
			Y = sum - sum2;
			if(m == 0) {
				ans = Math.abs(X - Y);
				itijikai = 0 + Math.abs(X - Y);
			}
			if(0 + Math.abs(X - Y) <= itijikai) {
				ans = Math.abs(X - Y);
			}
		}
		System.out.println(ans);
	}
}