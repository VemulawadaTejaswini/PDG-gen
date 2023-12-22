package atc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        sc.close();

        //        int work = (int) Math.pow(100, d);

        int work = 1;

        for (int i = 0; i < d; i++) {
            work = work * 100;
        }

        System.out.println(work * n);

    }
}