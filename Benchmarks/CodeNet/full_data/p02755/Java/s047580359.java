import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		int ans = -1;
		for (int i = 1; i <= 200; i++) {
			double x = (double)i;
			//System.out.println((int)(x*1.08/1));
			if (((int)(x*1.08)/1)-x == A&& (int)((x*1.1)/1)-x == B) {
				ans = (int)x;
				break;
			}
		}
		System.out.println(ans);
	}
}