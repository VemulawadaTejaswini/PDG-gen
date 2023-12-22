
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String C = scanner.next();
        char c  = C.toCharArray()[0];
        System.out.println((char) (c + 1));
    }
}
