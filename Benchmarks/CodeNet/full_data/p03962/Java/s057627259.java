import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		long result = 0;
		int n = sc.nextInt();
		long x = sc.nextInt();
		long y = sc.nextInt();
		XY xy = new XY(x, y);
		for (int i = 0; i < n - 1; ++i) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			XY ab = new XY(a, b);
			xy = getNewXY(xy, ab);
		}
		result = xy.x + xy.y;
		System.out.println(result);

	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	XY getNewXY(XY oldXY, XY rate) {
		long a = oldXY.x;
		long b = oldXY.y;
		long x = rate.x;
		long y = rate.y;
		long m = 0;
		long n = 0;
		for (long i = (long) Math.ceil(1.0*y / x * a); i <= Long.MAX_VALUE; ++i) {
			//System.out.println(i);
			if(i-b<0){
				i=b;
				continue;
			}
			if (i % y == 0) {
				n = i - b;
				break;
			}
		}
		m = x * (b + n) / y - a;
		//System.out.println(a + m + "," + (b + n));
		return new XY(a + m, b + n);
	}

}

class XY {
	long x;
	long y;

	public XY(long x, long y) {
		this.x = x;
		this.y = y;
	}
}