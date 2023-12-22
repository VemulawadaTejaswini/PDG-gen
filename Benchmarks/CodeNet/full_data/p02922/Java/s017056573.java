
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int a = in.nextInt();
        final int b = in.nextInt();
        if (b == 1) {
            System.out.println(0);
            return;
        }
        int sum = 0;
        int count = 0;
        while (true) {
            sum += a;
            count++;
            if (sum >= b) {
                break;
            }
            sum--;
        }
        System.out.println(count);
    }
}
