import java.util.*;
public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();

        double p=3.14159265358979;


        if (a * a * b < 2 * x) {
            double re = Math.toDegrees(Math.atan(a*a*b-x)*2/a/a/a) * 180 / p;
            System.out.println(re);
        } else {
            System.out.println(90 - Math.atan(x*2/a/b/b)*180/p);
        }
    }
}