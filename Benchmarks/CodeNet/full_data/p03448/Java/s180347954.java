import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), n = in.nextInt();

        int count = 0;
        for (int i = 0; i <= a; i++) {
            int x = 500 * i;
            for (int j = 0; j <= b; j++) {
                int y = 100 * j;
                if (n - x - y >= 0 && (n - x - y) % 50 == 0 && (n - x - y) / 50 <= c)
                    count++;
            }
        }
        System.out.println(count);

    }
}