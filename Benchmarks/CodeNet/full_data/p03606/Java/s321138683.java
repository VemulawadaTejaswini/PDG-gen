import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total = 0;
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            total += r - l + 1;
        }
        System.out.println(total);
    }
}
