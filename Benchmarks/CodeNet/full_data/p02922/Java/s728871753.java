import java.util.Scanner;

class Solver {
    void solve(Scanner in) {
        int plugs = in.nextInt();
        int expected = in.nextInt();
        int needs = (int) Math.ceil((expected - plugs) / (plugs - 1.) + 1);
        System.out.println(needs);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}