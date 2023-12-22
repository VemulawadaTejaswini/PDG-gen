import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextInt();
        long W = sc.nextInt();

        if (H == 1 || W == 1) {
            System.out.println(1);
            return;
        }

        if (H % 2 == 0 || W % 2 == 0) {
            System.out.println(H * W / 2);
        } else{
            System.out.println(H * W / 2 + 1);
        }

        return;
    }

}