import java.util.Scanner;

class Solver {
    public void Solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double ar = Math.sqrt(a * 1.0);
        double br = Math.sqrt(b * 1.0);
        double cr = Math.sqrt(c * 1.0);
        if (ar + br < cr) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
