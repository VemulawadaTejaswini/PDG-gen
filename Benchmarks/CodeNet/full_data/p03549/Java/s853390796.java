import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double sum = 0;
        double co = Math.pow(0.5, m);
        for (int i = 1; i <= 1000000; i++) {
            sum += (1900 * m + 100 * (n - m)) * i * Math.pow(1 - co, i - 1) * co;
        }
        System.out.println((int)Math.round(sum));
    }
}