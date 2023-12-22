import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong(), y = sc.nextLong();
        long cur = x;
        long cnt = 0;
        while (cur <= y) {
            if(cur <=  Long.MAX_VALUE - cur) {
                cur += cur;
            }
            else {
                break;
            }
            cnt ++;
        }
        System.out.println(cnt);
    }
}
