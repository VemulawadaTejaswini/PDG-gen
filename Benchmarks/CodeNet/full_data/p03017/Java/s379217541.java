import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    int N;
    int A;
    int B;
    int C;
    int D;
    byte[] S;

    private void run() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = scanner.nextInt() - 1;
        B = scanner.nextInt() - 1;
        C = scanner.nextInt() - 1;
        D = scanner.nextInt() - 1;
        S = scanner.next().getBytes();

        int time = 0;
        if (!check()) {
            System.out.println("No");
            return;
        }

        boolean ok = check2(time, A, B, C, D);
        if (ok) {
            System.out.println("Yes");
            return;
        } else {
            System.out.println("No");
            return;
        }
    }

    private boolean check() {
        for (int i = A; i < C - 1; i++) {
            if (S[i] == 35 && S[i + 1] == 35) {
                return false;
            }
        }
        for (int i = B; i < D - 1; i++) {
            if (S[i] == 35 && S[i + 1] == 35) {
                return false;
            }
        }
        return true;
    }

    private boolean check2(int time, int a, int b, int c, int d) {
        if (b >= N - 1 || b > d) {
            if (S[b - 1] != 35 && b - 1 != a) {
                return true;
            }
            return false;
        } else if (S[b] == 35) {
            return false;
        } else if (S[b - 1] != 35 && S[b + 1] != 35 && b - 1 != a) {
            return true;
        } else if (b == d && c > d) {
            if((S[b - 1] == 35 || S[b + 1] == 35)){
                return false;
            }else {
                return true;
            }
        }
        return check2(time, a, b + 1, c, d) ||
                check2(time, a, b + 2, c, d);
    }
}