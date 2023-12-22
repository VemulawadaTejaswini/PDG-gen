import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();

		if(x <= a*a*b/2) {
		double tan = (a*b*b/2)/x;
		System.out.println(Math.toDegrees(Math.atan(tan)));
		}else {
		double tan = 2*(b*a*a-x)/(a*a*a);
		System.out.println(Math.toDegrees(Math.atan(tan)));
		}
		sc.close();
	}
}