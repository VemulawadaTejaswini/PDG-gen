import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().run();
    }

    private void run() {
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A <= C && C <= B) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
