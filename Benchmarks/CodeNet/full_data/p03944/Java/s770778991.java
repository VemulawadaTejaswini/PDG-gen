import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int [] x = new int[N];
		int [] y = new int[N];
		int [] a = new int[N];
		for(int i = 0 ; i < N ; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		int xmin = 0, xmax = W, ymin = 0, ymax = H;
		for(int i = 0 ; i < N ; i++) {
			if(a[i] == 1) {
				xmin = Math.max(xmin, x[i]);
			} else if(a[i] == 2) {
				xmax = Math.min(xmax, x[i]);
			} else if(a[i] == 3) {
				ymin = Math.max(ymin, y[i]);
			} else if(a[i] == 4) {
				ymax = Math.min(ymax, y[i]);
			}
		}
		if(xmax - xmin < 0 || ymax - ymin < 0) {
			System.out.println(0);
		} else {
			System.out.println((xmax - xmin) * (ymax - ymin));
		}
	}
}
