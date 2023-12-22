import java.util.Scanner;

public class Main {

    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        String s = stdIn.next();

        char[] cs = s.toCharArray();
        cs[k] -= 32;

        s = cs.toString();
        System.out.println(s);
    }
}