

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            if (n == Math.floor(i * 1.08)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
    }
}
