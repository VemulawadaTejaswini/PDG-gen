import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        long c = n / (a+b);
        long d = n % (a+b);
        long e = Math.min(a, d);
        System.out.println(c * a + e);
    }
}
