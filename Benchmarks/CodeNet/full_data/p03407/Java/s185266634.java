import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a + b >= c)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
