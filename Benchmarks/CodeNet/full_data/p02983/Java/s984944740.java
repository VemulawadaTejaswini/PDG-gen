import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long min = 1000000;

        loop: for (long i=a; i<=b; i++) {
            for (long j=i+1; j<=b; j++) {
                long times = i * j;
                long mod = times % 2019;
                if (mod == 0) {
                    min = 0;
                    break loop;
                }

                if (min > times % 2019) {
                    min = times % 2019;
                }
            }
        }

        System.out.println(min);
    }
}
