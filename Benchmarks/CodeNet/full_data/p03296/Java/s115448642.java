

import java.util.Scanner;



public class Main {
    public static void main(String [] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int [] color = new int[n];
        for (int i = 0; i < n; ++i) {
            color[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n; ++i) {
            if (color[i] == color[i - 1]) {
                ++count;
                if (i + 1 < n && color[i - 1] - 1 != color[i + 1]) {
                    color[i] = color[i] - 1;
                } else {
                    color[i] = color[i - 1] + 1;
                }
            }
        }
        System.out.println(count);
    }
}
