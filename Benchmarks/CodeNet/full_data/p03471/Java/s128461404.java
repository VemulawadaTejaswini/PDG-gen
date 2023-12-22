import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int Y = stdin.nextInt();

        for (int x = 0; x <= 2000; x++) {
            for (int y = 0; y <= 4000; y++) {
                for (int z = 0; z < 5; z++) {
                    if (x * 10000 + y * 5000 + z * 1000 == Y) {
                        System.out.printf("%d %d %d", x, y, z);
                        return;
                    }
                }
            }
        }
    }
}
