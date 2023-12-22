import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int maxX = y / 10000;
        boolean success = false;
out:
        for (int X = 0; X <= maxX; X++) {
            int rest = y - X * 10000;
            int minY = 0;
            if (X + rest / 1000 > n) {
                minY = (rest - (n - X) * 1000) / 5000;
            }
            int maxY = (y - X * 10000) / 5000;
            for (int Y = minY; Y <= maxY; Y++) {
                int Z = (y - X * 10000 - Y * 5000) / 1000;
                if (y == X * 10000 + Y * 5000 + Z * 1000) {
                    if (n == X + Y + Z) {
                        System.out.println(X + " " + Y + " " + Z);
                        success = true;
                        break out;
                    }
                }
            }
        }
        if (!success) {
            System.out.println("-1 -1 -1");
        }
        scanner.close();
    }
}
