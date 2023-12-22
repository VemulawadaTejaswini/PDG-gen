import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a + b == 15)
            System.out.println("+");
        else if (a * b == 15)
            System.out.println("*");
        else
            System.out.println("x");
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
