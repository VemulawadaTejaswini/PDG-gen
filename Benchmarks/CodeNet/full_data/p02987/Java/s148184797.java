import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char[] chars = scanner.next().toCharArray();
        Arrays.sort(chars);
        if (chars[0] == chars[1] &&chars[2] == chars[3] &&chars[1] != chars[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
