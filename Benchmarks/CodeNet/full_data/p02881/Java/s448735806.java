import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long l = 1;
        long i = (n / 2) - 1;
        //ここから下消すかも
        boolean sosuu = true;
        for (int a = 1; a < Math.sqrt(n); a ++) {
            if (n % a == 0)
                l=a;
        }
        System.out.println(l + (n / l) - 2);
    }
}