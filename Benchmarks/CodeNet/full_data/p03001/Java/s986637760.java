import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long W = sc.nextLong();
        long H = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        double area = W * H / 2.0;
        int multiple = (x*2==W && y*2==H) ? 1 : 0;

        System.out.printf("%f %d\n", area, multiple);

    }
}