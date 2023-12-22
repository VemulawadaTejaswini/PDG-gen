import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long l = sc.nextLong();
        long r = sc.nextLong();
        if (r - l >= 2019) {
            System.out.println(0);
        } else {
            long min = 100000;
            for (long i = l; i <= r-1; i++) {
                for (long j = i+1; j <= r; j++) {
                    long tmp = ((i % 2019) * (j % 2019)) % 2019;
                    if (tmp < min) {
                        min = tmp;
                    }
                }
            }
            System.out.println(min);
        }
    }

}
