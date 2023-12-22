import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        q_1();
    }

    private static void q_1() {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println(b / a < c ? b / a : c);
        }
    }

}