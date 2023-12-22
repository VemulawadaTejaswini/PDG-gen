import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= 0 && b >= 0) {
            System.out.println("Zero");
            return;
        } else if (a > 0 && b > 0) {
            System.out.println("Positive");
            return;
        }

        int n = Math.abs(b - a) + 1;
        if (n % 2 == 0) System.out.println("Positive");
        else System.out.println("Negative");

        return;
    }

}