import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();
		double r;
		if(x>a*a*b/2) {
			r = Math.atan((2*b/a)-(2*x/(a*a*a)));
		}else {
			r = Math.atan((a*b*b)/(2*x));
		}
		System.out.println(String.format("%.10f", r*180/Math.PI));
	}

}
