import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int result = 0;

        int p1 = s.nextInt();
        int p2 = s.nextInt();
        int p3;

        for (int i = 0; i < n - 2; i++) {
            p3 = s.nextInt();

            System.out.println(p3);

            if (p1 > p2 && p2 > p3) {
                result += 1;
            } else if (p1 < p2 && p2 < p3) {
                result += 1;
            }

            p1 = p2;
            p2 = p3;
        }

        System.out.println(result);

    }
}
