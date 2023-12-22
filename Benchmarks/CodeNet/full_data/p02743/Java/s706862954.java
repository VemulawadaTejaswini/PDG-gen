import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        String ans = "No";
        if (a + 2 * Math.sqrt(a * b) + b < c)
            ans = "Yes";
        System.out.println(ans);
    }
}
