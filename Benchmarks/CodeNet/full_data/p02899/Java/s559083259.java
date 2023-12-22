

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[sc.nextInt() - 1] = i + 1;
        }
        String s = "";
        for (int i = 0; i < n; i++) {
            s += a[i];
            if (i < n - 1) {
                s += " ";
            }
        }
        System.out.println(s);

    }
}
