import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		final int C = sc.nextInt();
		final int D = sc.nextInt();
		final int E = sc.nextInt();
		final int F = sc.nextInt();

		int a, b, c, d;
		a = b = c = d = 0;
		double maxConcentration = -0.0;
		for (int na = 0; na <= 30; na++) {			
			for (int nb = 0; nb <= 30; nb++) {
				double waterAmt = 100 * (na * A + nb * B);
				if (waterAmt > F) {
					break;
				}
				for (int nc = 0; nc <= 3000; nc++) {
					for (int nd = 0; nd <= 3000; nd++) {
						double sugarAmt = nc * C + nd * D;
						double sugarPer100cc = (sugarAmt * 100 / waterAmt);
						if (sugarPer100cc > E || (waterAmt + sugarAmt) > F) {
							break;
						} else if (sugarPer100cc == E) {
							System.out.println((int) (waterAmt + sugarAmt) + " " + (int) sugarAmt);
							return;
						} else {
							double concentration = sugarAmt / (sugarAmt + waterAmt);
							if (concentration > maxConcentration) {
								maxConcentration = concentration;
								a = na;
								b = nb;
								c = nc;
								d = nd;
							}
						}
					}
				}
			}
		}
		int wt = (a * A + b * B) * 100;
		int sg = (c * C + d * D);
		System.out.println((wt + sg) + " " + sg);

		sc.close();
	}
}