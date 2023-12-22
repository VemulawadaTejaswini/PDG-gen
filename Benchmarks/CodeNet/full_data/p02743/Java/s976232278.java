import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double aa = a / 2;
		double g1;

		do {
			g1 = aa;
			aa = (a / g1 + g1)/2;
		} while((g1-aa) != 0);


		double bb = b / 2;
		double g2;
		do {
			g2 = bb;
			bb = (b / g2 + g2)/2;
		} while((g2-bb) != 0);

		double cc = c/2;
		double g3;
		do {
			g3 = cc;
			cc = (c / g3 + g3)/2;
		} while((g3-cc) != 0);
		
		if (aa + bb < cc) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}