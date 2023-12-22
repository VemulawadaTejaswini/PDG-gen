import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	static int n;
	static int ch;
	void doIt() {
		n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		int h[] = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		for(int i = 0; i <= 100; i++) {
			for(int j = 0; j <= 100; j++) {
				if(center(i, j, x, y, h)) {
					System.out.println(i+" "+j+" "+ch);
                                        return;
				}
			}
		}
	}
	boolean center(int cx, int cy, int[] x, int[] y, int[] h) {
		ch = h[0] + Math.abs(x[0] - cx) + Math.abs(y[0] - cy);
		for(int i = 1; i < n; i++) {
			if(h[i] != Math.max(ch - Math.abs(x[i] - cx) - Math.abs(y[i] - cy), 0)) {
				return false;
			}
		}
		return true;
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
