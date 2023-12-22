import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int r = in.nextInt();
			int g = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int maxr = n / r;
			int maxg = n / g;
			int maxb = n / b;
			int x = 0;
			for (int rn = 0; rn <= maxr; rn++) {
				int rv = r * rn;
				if (rv > n) {
					break;
				}
				if (rv == n) {
					x++;
					break;
				}
				for (int gn = 0; gn <= maxg; gn++) {
					int rgv = g * gn + rv;
					if (rgv > n) {
						break;
					}
					if (rgv == n) {
						x++;
						break;
					}
					for (int bn = 0; bn <= maxb; bn++) {
						int rgbv = b * bn + rgv;
						if (rgbv == n) {
							x++;
						}
					}
				}
			}
			System.out.println(x);
		}
	}
	
}
