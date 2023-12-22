import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        sc.close();

        double h = (double)x / Math.pow(a, 2);
        double a1 = a * h * 2 / b;
        double c = Math.sqrt(Math.pow(a1, 2) + Math.pow(b, 2));
        double cos = (Math.pow(a1, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a1 * c);
        double r = Math.acos(cos);
        System.out.println(Math.toDegrees(r));
    }
}