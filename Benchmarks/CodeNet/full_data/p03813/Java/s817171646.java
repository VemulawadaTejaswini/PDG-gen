import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int x = in.nextInt();
            System.out.println(x < 1200 ? "ABC" : "ARC");
        }
    }
}
