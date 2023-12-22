import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String[] board = new String[N];
        for (int i = 0; i < N; ++i) {
            board[i] = scanner.nextLine();
        }
        int count = 0;
        for (int a = 0; a < N; ++a) {
            if (check(board, N, a)) {
                ++count;
            }
        }
        System.out.println(count * N);
    }

    private static boolean check(String[] board, int N, int a) {
        for (int y = 0; y < N; ++y) {
            for (int x = 0; x < N; ++x) {
                int y2 = x - a;
                int x2 = y + a;
                if (y2 < 0) {
                    y2 += N;
                }
                if (x2 >= N) {
                    x2 -= N;
                }
                if (y2 != x2) {
                    if (board[y].charAt(x) != board[y2].charAt(x2)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}