import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        int mod2 = 0;
        int mod4 = 0;
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if (n % 4 == 0) mod4++;
            else if (n % 2 == 0) mod2++;
        }
        if (mod4 >= N / 2 || mod4 >= (N - (mod2 & ~1)) / 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}