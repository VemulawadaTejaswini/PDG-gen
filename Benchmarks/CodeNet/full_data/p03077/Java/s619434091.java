

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long n = sc.nextLong();
        long[] arr = new long[5];
        long max = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
            long sum = 0;
            if (n % arr[i] == 0) {
                sum = n / arr[i];
            } else {
                sum = n / arr[i] + 1;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max + 4);
    }
}
