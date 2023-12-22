

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int a = sc.nextInt();
        if (a < min) {
            min = a;
        }
        if (a > max) {
            max = a;
        }
        int b = sc.nextInt();
        if (b < min) {
            min = b;
        }
        if (b > max) {
            max = b;
        }
        int c = sc.nextInt();
        if (c < min) {
            min = c;
        }
        if (c > max) {
            max = c;
        }
        int d = sc.nextInt();
        if (d < min) {
            min = d;
        }
        if (d > max) {
            max = d;
        }
        int e = sc.nextInt();
        if (e < min) {
            min = e;
        }
        if (e > max) {
            max = e;
        }
        int k = sc.nextInt();
        if (max - min <= k) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
