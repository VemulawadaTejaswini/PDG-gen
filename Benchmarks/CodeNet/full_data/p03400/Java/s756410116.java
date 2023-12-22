

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int D = sc.nextInt();
            int X = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += (D - 1) / sc.nextInt() + 1;
            }
            System.out.println(sum + X);
        }
    }
}
