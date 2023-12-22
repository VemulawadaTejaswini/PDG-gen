import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long i;
		long bis = 1L;
		long yen = 0L;
		if(k >= a + 1) {
			if(b - a > a) {
				bis = a;
				long dif = k - (a - 1L);
				bis += (b - a) * (dif / 2L);
				bis += dif %2;
			} else if(b - a > 2) {
				for(i = 0; i < k - 1L; i++) {
					if(bis < a) bis++;
					else {
					bis -= a;
						yen++;
					}
				}
				bis += (b * yen);
			} else {
				bis += k;
			}
		} else {
			bis += k;
		}
		System.out.println(bis);
	}
}
