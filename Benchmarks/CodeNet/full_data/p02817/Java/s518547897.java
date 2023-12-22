import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        System.out.println(T + S);
    }
}
