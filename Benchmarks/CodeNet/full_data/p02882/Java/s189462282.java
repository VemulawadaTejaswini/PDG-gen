import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double x = input.nextDouble();
		double V=a*a*b;
		x/=a; //Converting from prism to rectangle
		V/=a;
		double baseleg = 2*x/b;
		if (baseleg<=a) {
			double theta = Math.toDegrees(Math.atan(b/baseleg));
			System.out.println(theta);
		}else {
			double remainingVol = V-x;
			double y = 2*remainingVol/a;
			double theta = Math.toDegrees(Math.atan(y/a));
			System.out.println(theta);
		}
	}
}