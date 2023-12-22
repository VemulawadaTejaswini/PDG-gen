import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Y = scanner.nextInt();

        if (Y % 1000 != 0) {
            System.out.println("-1 -1 -1");
            return;
        }

        Y /= 1000;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                int k = N - i - j;
                if (i * 10 + j * 5 + k == Y) {
                    System.out.printf("%d %d %d", i, j, k);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
