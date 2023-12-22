import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        String ans = "No";
        double d = c - a - b;
        if (4 * a * b < Math.pow(d, 2))
            ans = "Yes";
        if (0 > d)
            ans = "No";
        System.out.println(ans);
    }
}
