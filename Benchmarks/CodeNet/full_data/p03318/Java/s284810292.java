
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/6/23 11:55
 * @see meituan.n2018.Bturn
 */
public class Main {

    private static long S(long n) {
        int tmp = 0;
        while (n > 0) {
            tmp += n % 10;
            n /= 10;
        }
        return tmp;
    }

    public static void main(String args[]) throws FileNotFoundException {

//        System.setOut(new PrintStream("src/out.txt"));

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        for (int i = 1; i <= k && i < 10; i++) {
            System.out.println(i);
        }
        long mod = 1;
        long cur = 19;
        long last = 10;

        for (int i = 10; i <= k; ) {
            long tmp = cur;
            List<Long> list = new ArrayList<>();
            list.add(tmp);
            if (tmp == 399) {
                list.add((long) 398);
            }

            long val = tmp / S(tmp);
            while (tmp - mod > mod && tmp - mod > last && (tmp - mod) / S(tmp - mod) <= val) {
                tmp -= mod;
                list.add(tmp);
            }
            last = cur;
            if (cur + mod * 10 > mod * 100) {
                cur += mod * 100;
            } else {
                cur += mod * 10;
            }
            if (cur > mod * 100) {
                mod *= 10;
            }
            for (int j = list.size() - 1; j >= 0 && i <= k; j--, i++) {
                System.out.println(list.get(j));
            }
        }
    }
}
