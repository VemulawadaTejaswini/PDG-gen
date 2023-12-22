import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (t < x + y || t % 2 != (x + y) % 2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
