import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        if (a * 2 < b) {
            b = a * 2;
        }
        if (b * 2 < c) {
            c = b * 2;
        }
        if (c * 2 < d) {
            d = c * 2;
        }
        long count = 0;
        if (n >= 2) {
            count += (long)d * (n / 2);
            n %= 2;
        }
        
        if (n >= 1) {
            count += (long)c * n;
        }
        
        System.out.println(count);
    }
}