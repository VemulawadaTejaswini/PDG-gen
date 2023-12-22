

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;
        String str = sc.next();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int p1 = i % 2 == 0 ? 1 : 0;
            int p2 = i % 2 == 0 ? 0 : 1;
            int s = c[i] == 48 ? 0 : 1;
            sum += p1 ^ s;
//            System.out.println(p1 + ":" + s + ":" + (p1 ^ s));
            sum2 += p2 ^ s;
        }
        System.out.println(Math.min(sum, sum2));
    }
}
