import java.util.Scanner;

public class Main{
    static Scanner in = new Scanner(System.in);
    static String s;

    public static void main(String[] args) {
        int n, m;
        n = in.nextInt();
        m = in.nextInt();
        System.out.println((n + 1) * (m + 1) - 2 * (n + 1) - 2 * (m + 1) + 4);
    }
}