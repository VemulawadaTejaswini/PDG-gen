import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long sum = 0;
        for (int i = 1; i <= N - 1; i++) {
            sum += i;
        }

        System.out.println(sum);
        return;
    }

}