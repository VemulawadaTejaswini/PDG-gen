import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long total = 0;
        if (b <= c) {
            total += b * 2;
            c -= b;
        } else {
            total += b + c;
            c = 0;
        }
        if (a < c) {
            total += a + 1;
        } else {
            total += c;
        }
       System.out.println(total);
    }
}
