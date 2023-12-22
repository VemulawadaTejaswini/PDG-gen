import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long ga = sc.nextInt();
        long sa = sc.nextInt();
        long ba = sc.nextInt();
        long gb = sc.nextInt();
        long sb = sc.nextInt();
        long bb = sc.nextInt();
        
        long p1 = Math.min(ga, gb);
        long p2 = n / p1;
        long p3 = n % p1;
        long p4 = p2 * Math.max(ga, gb) + p3;
        
        long p5 = Math.min(sa, sb);
        long p6 = p4 / p5;
        long p7 = p4 % p5;
        long p8 = p6 * Math.max(sa, sb) + p7;
        
        long p9 = Math.min(ba, bb);
        long p10 = p8 / p9;
        long p11 = p8 % p9;
        long p12 = p10 * Math.max(ba, bb) + p11;
        
        System.out.println(p12);
    }
}
