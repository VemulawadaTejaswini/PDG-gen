import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int contest = n / 3;
        int no1 = 0;
        int no2 = 0;
        int no3 = 0;

        for (int i = 0; i < n; i++) {
            if (p[i] <= a) {
                no1 = no1 + 1;
            } else if (p[i] <= b) {
                no2 = no2 + 1;
            } else {
                no3 = no3 + 1;
            }
        }
        int m1 = Math.min(no1,no2);
        int m2 = Math.min(no2,no3);

        System.out.println(Math.min(m1,m2));
    }
}









