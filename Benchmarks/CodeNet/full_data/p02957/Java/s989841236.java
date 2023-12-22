import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();

            if ((A + B) % 2 == 0) {
                System.out.println((A + B) / 2);
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}
