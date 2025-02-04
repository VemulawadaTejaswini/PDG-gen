import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }

            for (int i = 0; i < N; i++) {
                if (a[i] <= 399) {
                    a[i] = 1;
                } else if (a[i] <= 799) {
                    a[i] = 2;
                } else if (a[i] <= 1199) {
                    a[i] = 3;
                } else if (a[i] <= 1599) {
                    a[i] = 4;
                } else if (a[i] <= 1999) {
                    a[i] = 5;
                } else if (a[i] <= 2399) {
                    a[i] = 6;
                } else if (a[i] <= 2799) {
                    a[i] = 7;
                } else if (a[i] <= 3199) {
                    a[i] = 8;
                } else {
                    a[i] = 0;
                }
            }

            HashSet<Integer> colors = new HashSet<>();
            int count0s = 0;
            for (int i = 0; i < N; i++) {
                if (a[i] > 0) {
                    colors.add(a[i]);
                } else {
                    count0s++;
                }
            }

            System.out.println(colors.size() + " " + Math.min(8, colors.size() + count0s));
        }
    }
}
