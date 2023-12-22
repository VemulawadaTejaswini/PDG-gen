import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        if(a.equals("AAA") || a.equals("BBB")) {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }

    }
}
