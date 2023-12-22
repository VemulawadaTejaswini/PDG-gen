import java.util.Scanner;

class Solver {

    private final int N;

    Solver(Scanner in){
        N = in.nextInt();
    }

    void solve() {
        System.out.println(1. * (N - (N / 2)) / N);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}