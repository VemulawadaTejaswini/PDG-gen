import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int a = Character.getNumericValue(n.charAt(0));
        int b = Character.getNumericValue(n.charAt(1));
        System.out.println("999".equals(n) ? n : a > b ? a * 111 : (a + 1) * 111);
    }
}
