import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}

		int left = 0;
		int right = w;
		int btm = 0;
		int top = h;

		for(int i=0; i<n; i++) {
			switch(a[i]) {
			case 1:
				left = Math.max(left, x[i]);
				break;
			case 2:
				right = Math.min(right, x[i]);
				break;
			case 3:
				btm = Math.max(btm, y[i]);
				break;
			case 4:
				top = Math.min(top, y[i]);
				break;
			}
		}

		int square = (Math.max(0, right-left))* (Math.max(0, top-btm));

		System.out.println(square);
		sc.close();
	}
}