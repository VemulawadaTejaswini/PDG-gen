import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        b = Math.max(0, b - Math.max(0, k - a));
        a = Math.max(0, a - k);
        System.out.println(a + " " + b);
    }
}