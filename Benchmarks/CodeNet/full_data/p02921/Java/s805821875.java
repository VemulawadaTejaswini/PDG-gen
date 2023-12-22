import java.util.Scanner;

class Solver {
    void solve(Scanner in) {
        String S = in.next();
        String T = in.next();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            if (S.charAt(i) == T.charAt(i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}