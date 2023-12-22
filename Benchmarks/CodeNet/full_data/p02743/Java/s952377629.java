import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        String ans = "No";
        if (0 < Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) - 2 * (a * c + b * c + a * b))
            ans = "Yes";
        System.out.println(ans);
    }
}