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
            if(x % 2 == 0) {
                minPrice += Math.min(a, c * 2) * x;
            } else {
                minPrice += Math.min(a * 2, c * 2) * ((x - 1) / 2);
                minPrice += Math.min(a, c * 2);
            }
        } else if(x < y) {
            minPrice += c * 2 * x;
            y -= x;
            if(y % 2 == 0) {
                minPrice += Math.min(b, c * 2) * y;
            } else {
                minPrice += Math.min(b * 2, c * 2) * ((y - 1) / 2);
                minPrice += Math.min(b, c * 2);
            }
        } else {
            minPrice += c * 2 * x;
        }
        System.out.println(minPrice);
    }
}
