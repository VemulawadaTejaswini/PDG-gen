import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d[] = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = in.nextInt();
        }

        Arrays.sort(d);
        System.out.println(d[n / 2] - d[n / 2 - 1]);
    }
}
