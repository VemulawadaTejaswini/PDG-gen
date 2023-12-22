import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt() - 1;
        int B = scanner.nextInt() - 1;
        scanner.close();
        char[][] g = new char[100][100];

        for (int i = 0; i < 50; i++) {
            Arrays.fill(g[i], '#');
        }
        for (int i = 50; i < 100; i++) {
            Arrays.fill(g[i], '.');
        }

        int x = 0;
        int y = 0;
        for (int i = 0; i < A; i++) {
            g[x][y] = '.';
            y += 2;
            if (y >= 100) {
                x += 2;
                y = 0;
            }
        }
        x = 51;
        y = 0;
        for (int i = 0; i < B; i++) {
            g[x][y] = '#';
            y += 2;
            if (y >= 100) {
                x += 2;
                y = 0;
            }
        }

        System.out.println("100 100");

        for (int i = 0; i < 100; i++) {
            System.out.println(g[i]);
        }

    }

}