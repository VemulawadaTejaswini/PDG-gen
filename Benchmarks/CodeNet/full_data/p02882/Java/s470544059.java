import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        if(x >= 0.5*a*a*b) {
        		double d = Math.toDegrees(Math.atan((a*a*b-x)*2/(a*a*a)));
        		System.out.println(d);
        } else {
        		double d = Math.toDegrees(Math.atan(0.5*a*b*b/x));
        		System.out.println(d);
        }
    }
}