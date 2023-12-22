import java.util.Scanner;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final String S = sc.next().intern();
        System.out.println(S.replaceAll(".", "x"));
    }
}

public class Main {
    public static void main(String... args) {
        B.main();
    }
}
