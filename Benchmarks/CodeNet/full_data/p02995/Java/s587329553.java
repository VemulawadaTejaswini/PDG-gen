import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long c = Long.parseLong(sc.next());
		long d = Long.parseLong(sc.next());
		long cBaisuIndex = a / c;
		if (a % c != 0) {
			cBaisuIndex++;
		}
		long cMaxIndex = b / c + 1;

		long dBaisuIndex = a / d;
		if (a % d != 0) {
			dBaisuIndex++;
		}
		long dMaxIndex = b / d + 1;
		long koyakusu = 0;
		koyakusu = getMaxKoyakusu(c, d);
		long cdBaisuIndex = a / koyakusu;
		if (a % koyakusu != 0) {
			cdBaisuIndex++;
		}
		long cdMaxIndex = b / koyakusu + 1;
		long ab = b - a + 1;
		long ret = ab - (cMaxIndex - cBaisuIndex) - (dMaxIndex - dBaisuIndex) + (cdMaxIndex - cdBaisuIndex);
		System.out.print(ret);
	}

	public static long getMaxKoyakusu(long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while ((temp = (long) a % b) != 0) {
			a = b;
			b = (long) temp;
		}
		return (long) (c / b);
	}
}
