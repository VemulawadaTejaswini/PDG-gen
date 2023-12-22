import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(a + b <= (c * 2)) {
           System.out.println((a * x) + (b * y));
           return;
        }
        long minPrice = 0;
        if(x > y) {
            minPrice += c * 2 * y;
            x -= y;
            minPrice += Math.min(a, c * 2) * x;
        } else if(x < y) {
            minPrice += c * 2 * x;
            y -= x;
            minPrice += Math.min(b, c * 2) * y;
        } else {
            minPrice += c * 2 * x;
        }
        System.out.println(minPrice);
    }
}