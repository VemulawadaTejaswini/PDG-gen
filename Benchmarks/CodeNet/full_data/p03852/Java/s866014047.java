import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String c = sc.next();

        System.out.println(Arrays.asList("a","i","u","e","o").contains(c) ? "vowel" : "consonant");
    }
}
