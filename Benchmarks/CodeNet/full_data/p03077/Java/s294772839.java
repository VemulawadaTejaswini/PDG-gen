// https://atcoder.jp/contests/abc123/tasks/abc123_c

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long min = Long.MAX_VALUE;
        long[] list = new long[5];
        for (int i = 0; i < 5; i++) {
            list[i] = sc.nextLong();
            if (list[i] < min) {
                min = list[i];
            }
        }

        System.out.println((long)Math.ceil(N/(double)min) + 4);
    }
}