import java.util.Scanner;

public class Main {
    static char[] c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean b = s.charAt(2) == s.charAt(3);
        boolean b2 = s.charAt(4) == s.charAt(5);

        System.out.println(b&&b2?"Yes":"No");
    }
}