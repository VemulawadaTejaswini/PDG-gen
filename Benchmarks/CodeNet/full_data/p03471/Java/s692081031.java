import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int Y = Integer.parseInt(scanner.next());
        scanner.close();

        for (int x = 0; x <= N; x++) {
            for (int y = 0; y <= N; y++) {
                int z = N - x - y;
                if (z < 0) continue;

                if ((x * 10000 + y * 5000 + z * 1000) == Y) {
                    System.out.println(String.format("%d %d %d", x, y, z));
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}
