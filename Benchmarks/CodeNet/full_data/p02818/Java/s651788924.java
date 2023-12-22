import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        long o = a;
        a = Math.max(0, a - k);
        k -= o;
        b = Math.max(0, b - k);

        System.out.println(a + " " + b);
    }
}