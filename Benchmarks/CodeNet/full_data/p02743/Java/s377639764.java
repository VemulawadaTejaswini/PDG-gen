import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        String ans = "";
        double d = c - a - b;
        if (4 * a * b < d * d && d > 0)
            ans = "Yes";
        else {
            ans = "No";
        }
        System.out.println(ans);
    }
}
