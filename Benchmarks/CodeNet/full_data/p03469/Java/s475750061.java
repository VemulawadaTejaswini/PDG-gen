import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            System.out.println(S.substring(0, 3) + "8" + S.substring(4, 10));
        }
    }
}
