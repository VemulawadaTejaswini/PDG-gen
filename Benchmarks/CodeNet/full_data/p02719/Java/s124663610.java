import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        long n = stdIn.nextLong();
        long k = stdIn.nextLong();
        
        System.out.println(Math.min(n % k, k - (n % k)));
        
    }
}
