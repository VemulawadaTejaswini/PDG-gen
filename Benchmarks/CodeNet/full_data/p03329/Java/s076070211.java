

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long a = sc.nextLong();
        int count = 0;
        while (a >= 36) {
            long beforeNine = 0;
            long beforeSix = 0;
            long nine = 9;
            while (a > 0 && nine <= a) {
                beforeNine = nine;
                nine = nine * 9;
            }
            long six = 6;
            while (a > 0 && six <= a) {
                beforeSix = six;
                six = six * 6;
            }
            a = a - Math.max(beforeSix, beforeNine);
            count++;
        }
        count = Math.min(search(a, 6, count), search(a, 9, count));
        System.out.println(count);
    }

    private static int search(long a, int num, int count) {
        if (a < num) {
            return count + (int) a;
        }
        a -= num;
        count++;
        return Math.min(search(a, 6, count), search(a, 9, count));

    }
}
