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

        int C = A * 1000/8 / 10;

        for (int i = 1; i <= 10000; i++) {
            if ((i / 10) == B && C == i) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
        return;
    }

}
