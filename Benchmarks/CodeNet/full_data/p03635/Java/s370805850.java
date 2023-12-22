import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println((n - 1) * (m - 1));
    }
    public static void main(String[] args) {
        new Main().run();
    }
}