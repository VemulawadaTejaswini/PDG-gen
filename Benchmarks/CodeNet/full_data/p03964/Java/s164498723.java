import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        while (n-- > 1) {
            long newA = sc.nextLong();
            long newB = sc.nextLong();
            long x = (long)Math.ceil(Math.max((double)a / newA), Math.max((double)b / newB));
            a = newA * x;
            b = newB * x;
        }
        
        System.out.println(a+b);
    }
}