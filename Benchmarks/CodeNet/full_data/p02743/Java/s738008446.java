import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		Main main = new Main();
		if(main.sqrt(a) + main.sqrt(b) < main.sqrt(c)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

	public static double sqrt(double a){
		if (Double.isNaN(a) || a < 0.0) {
			return Double.NaN;
		}
		if (a == 0.0) {
			return 0.0;
		}
		double x = a > 1.0 ? a : 1.0;
		double d = a;
		while(d > 0.0){
			double x1 = (x + a / x) / 2;
			d = x - x1;
			x = x1;
		}
		return x;
	}

}

