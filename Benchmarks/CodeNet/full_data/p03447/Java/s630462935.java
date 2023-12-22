import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println((x-a)%b);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
