import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long q = sc.nextLong();
        long h = sc.nextLong();
        long s = sc.nextLong();
        long d = sc.nextLong();
        int n = sc.nextInt();
        long min = 1000000000;
        if (n % 2 == 0) {
          long[] tmp = {q*8, h*4, s*2, d};
          for (int i = 0; i < 4; i++) {
            if (min > tmp[i]) {
              min = tmp[i];
            }
          }
          System.out.println(n/2 * min);
        } else {
          long[] tmp = {q*8, h*4, s*2, d};
          for (int i = 0; i < 4; i++) {
            if (min > tmp[i]) {
              min = tmp[i];
            }
          }
          if (q*4 >= h*2) {
            if (h*2 >= s) {
              System.out.println(n/2 * min + s);
            } else {
              System.out.println(n/2 * min + h*2);
            }
          } else {
            if (q*4 >= s) {
              System.out.println(n/2 * min + s);
            } else {
              System.out.println(n/2 * min + q*4);
            }
          }
        }
    }

}
