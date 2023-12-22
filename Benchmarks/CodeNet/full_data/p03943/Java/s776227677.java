import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int xs, xg, ys, yg;
	void run() {
		Scanner sc = new Scanner(System.in);
		xs = ys = 0;
		xg = sc.nextInt();
		yg = sc.nextInt();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			switch(sc.nextInt()) {
			case 1 :
				xs = Math.max(x,xs);
				break;
			case 2 :
				xg = Math.min(x, xg);
				break;
			case 3 :
				ys = Math.max(y, ys);
				break;
			case 4 :
				yg = Math.min(y, yg);
			}
		}
		int area = (xg - xs) * (yg - ys);
		System.out.println(area < 0 ? 0 : area);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}