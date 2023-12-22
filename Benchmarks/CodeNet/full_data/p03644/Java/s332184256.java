import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;

        while (n > 0) {
            n /= 2;
            k += 1;
        }

        System.out.println(1 << (k - 1));
    }
}