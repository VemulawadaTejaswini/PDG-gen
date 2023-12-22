import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0)
            System.out.println(n);
        else
            System.out.println(n * 2);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
