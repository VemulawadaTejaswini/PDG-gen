import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int AB = in.nextInt();
            int BC = in.nextInt();
            int CA = in.nextInt();
            System.out.println(AB * BC / 2);
        }
    }
}
