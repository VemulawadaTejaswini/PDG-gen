import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0 ; i < n ; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int nowT = 0;
		int X = 0;
		int Y = 0;
		for(int i = 0 ; i < n ; i++) {
			if(t[i] - nowT == Math.abs(x[i] - X) + Math.abs(y[i] - Y)) {
				nowT = t[i];
				X = x[i];
				Y = y[i];
			} else if(t[i] - nowT > Math.abs(x[i] - X) + Math.abs(y[i] - Y) && nowT % 2 == (t[i] - nowT) % 2) {
				nowT = t[i];
				X = x[i];
				Y = y[i];
			} else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
