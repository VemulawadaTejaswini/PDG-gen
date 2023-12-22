import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();
        int x = std.nextInt();
        int y = std.nextInt();

        int[] xs = new int[n + 1];
        int[] ys = new int[m + 1];

        for (int i = 0; i < n; i++) {
            xs[i] = std.nextInt();
        }
        xs[n] = x;

        for (int i = 0; i < m; i++) {
            ys[i] = std.nextInt();
        }
        
        ys[m] = y;

        int maxX = Arrays.stream(xs).max().getAsInt();
        int minY = Arrays.stream(ys).min().getAsInt();
        if (maxX < minY) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
    }
}
