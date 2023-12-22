import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        long K = sc.nextLong();

        long taka = 
            K >= 1 ? A * (K - 1) + B * K + C * K : A;
        long naka =
            K >= 1 ? A * K + B * (K - 1) + C * K : B;
        long diff = taka - naka;

        if (diff > 1000000000000000000L) {
            System.out.println("Unfair");
        } else {
            System.out.println(taka - naka);
        }

        return;
    }

}
