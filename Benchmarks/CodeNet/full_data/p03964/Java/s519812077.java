
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		double A = sc.nextInt();
		double B = sc.nextInt();

		for (int i = 0; i < N - 1; i++) {
			double rateA = sc.nextInt();
			double rateB = sc.nextInt();	
			if (A / B != rateA /  rateB) {
				for (int b = 0;; b++) {
					if (((rateA+rateB)*(B+b) / rateB)   % 1 == 0) {
						double tempB=B+b;
						double tempA=rateA / rateB * tempB;
						if (tempA<A||tempB<B) {	
						}else {
							B = tempB;
							A = tempA;
							break;
						}		
					}
				}
			}
		}
		System.out.println((int)(A + B));

	}

}
