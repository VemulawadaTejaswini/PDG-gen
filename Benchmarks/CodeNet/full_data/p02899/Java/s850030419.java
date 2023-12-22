

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            a[num - 1] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
