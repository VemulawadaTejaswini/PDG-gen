import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int X = in.nextInt();
            int A = in.nextInt();
            System.out.println(X < A ? 0 : 10);
        }
    }
}
