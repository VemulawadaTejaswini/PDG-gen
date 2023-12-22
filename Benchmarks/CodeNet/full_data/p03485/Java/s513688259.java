import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println((int) Math.ceil((a + b) / 2.0));
        }
    }
}
