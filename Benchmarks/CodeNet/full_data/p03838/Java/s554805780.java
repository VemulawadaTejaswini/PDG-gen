
import java.util.Scanner;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        // first way

        long ans = 0;

        if(x >= 0) {
            if(x <= y) {
                ans = y - x;
            } else if(x <= Math.abs(y)) {
                ans = 1 + Math.abs(y) - x;
            } else {
                ans = 1 + x + y;
            }
        }
        else {
            if(x == y) {
                ans = 0;
            }
            else if(x < y) {
                if(Math.abs(x) <= y) {
                    ans = 1 + y - Math.abs(x);
                } else {
                    ans = y - x;
                }
            } else {
                ans = 2 + x - y;
            }
        }

        System.out.println(ans);
    }
}