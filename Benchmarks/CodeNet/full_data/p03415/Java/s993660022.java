import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("" + scan.next().charAt(0) + scan.next().charAt(1) + scan.next().charAt(2));
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
