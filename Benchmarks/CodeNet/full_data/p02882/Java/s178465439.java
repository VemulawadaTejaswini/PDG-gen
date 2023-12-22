import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.setIn(Main.class.getClassLoader().getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        double a = sc.nextInt();
        double b = sc.nextInt();
        double x = sc.nextInt();
        double h = (x/(a*a));
        double angle = 0.0;
        if(x >= a*a*b/2) {
            double p = 2.0*x/(a*a) - b;
            angle = Math.atan(a/(b-p));
        }
        else {
            double p = 2*x/(b*a);
            angle = Math.atan(b/p);
        }
        //angle = Math.atan(2*h*a);
        System.out.println(180.0*(angle/Math.PI));
    }

    private static long solve(long n) {
        long racine = (int) (Math.sqrt(n) + 1);
        for(long i = racine; i >= 2; i--) {
            if(n %i == 0) return (i-1) + (n/i - 1);
        }
        return n - 1;
    }
}
