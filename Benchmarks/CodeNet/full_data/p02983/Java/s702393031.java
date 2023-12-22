import java.util.*;
 
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long min = Long.MAX_VALUE;
 
        if (l - r >= 2018) {
            System.out.println(0);
        } else {
            for (long i = l; i <= r ; i++) {
                for (long j = i + 1; j <= r ; j++) {
                    long val = (i % 2019 * j % 2019) % 2019;
                    if (val == 0) {
                        System.out.println(0);
                        return;
                    }
                    min = Math.min(val , min);
                }
            }
            System.out.println(min);
        }
    }
}