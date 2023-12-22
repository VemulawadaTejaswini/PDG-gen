import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        
        long count = 0;
        if (a % x == 0 || b % x == 0) {
            count++;
        }
        long l = b - a;
        count += l / x;
        
        System.out.println(count);
    }
}
