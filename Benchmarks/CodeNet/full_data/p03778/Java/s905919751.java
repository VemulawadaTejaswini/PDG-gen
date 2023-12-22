import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int W = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(Math.max(a, b) <= Math.min(a + W, b + W) ? 0 : Math.min(Math.abs((a + W) - b), Math.abs((b + W) - a)));
        }
    }
}
