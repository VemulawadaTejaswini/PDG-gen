import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        double k = (double)2*x/(a*b);
        double l = (double)2*(a*a*b-x)/(a*a);

        if (0 <= k && k <= a) {
            System.out.println((double)90-Math.toDegrees(Math.atan(k/b)));
        } else if (0 <= l && l <= b) {
            System.out.println(Math.toDegrees(Math.atan(l/a)));
        } else {
            System.out.println("***");
        }
    }
}
