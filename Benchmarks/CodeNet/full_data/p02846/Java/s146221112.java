import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		long a1 = sc.nextLong();
		long a2 = sc.nextLong();
		long b1 = sc.nextLong();
		long b2 = sc.nextLong();
		long x1 = t1 * (a1 - b1);
		long x2 = t2 * (a2 - b2);
		if ((x1 >= 0 && x2 >= 0) || (x1 < 0 && x2 < 0)) {
		    System.out.println(0);
		    return;
		}
		if (x1 + x2 == 0) {
		    System.out.println("infinity");
		    return;
		}
		if (x1 + x2 > 0) {
		    if (x1 >= 0) {
		        System.out.println(0);
		        return;
		    }
		    long xx = x1 + x2;
		    long count = (-x1 + xx - 1) / xx;
		    long add = 0;
		    if (-x1 % xx == 0) {
		        add++;
		    }
		    System.out.println(count * 2 - 1 + add);
		} else {
		    if (x1 < 0) {
		        System.out.println(0);
		        return;
		    }
		    long xx = -(x1 + x2);
		    long count = (x2 + xx - 1) / xx;
		    long add = 0;
		    if (x2 % xx == 0) {
		        add++;
		    }
		    System.out.println(count * 2 - 1 + add);
		}
	}
}
