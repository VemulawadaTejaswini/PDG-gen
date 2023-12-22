import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        
        long count = 0;
        count += b / x + 1;
        count += a / x;
        
        if (a == 0 && b == 0) {
            count = 1;
        }
        
        System.out.println(count);
    }
}
