import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        String S = sc.next();
        for (int i = N / 2; i > 0; i--) {
            for (int j = 0; j < N - i; j++) {
                String substring = S.substring(j, i + j);
                if (S.indexOf(substring, i + j + 1) >= 0) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}