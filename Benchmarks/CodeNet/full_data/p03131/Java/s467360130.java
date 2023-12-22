import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long i;
		long bis = 1;
		long yen = 0;
		if(k > a + 1) {
			if(b - a > a) {
				bis = a;
				long dif = k - (a -1);
				bis += (b - a) * (dif / 2);
				bis += dif %2;

			} else if(b - a > 2) {
				for(i = 0; i < k - 1; i++) {
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
