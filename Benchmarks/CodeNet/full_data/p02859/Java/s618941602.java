import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final int n = Integer.parseInt(sc.next());
        System.out.println(n*n);
        sc.close();
    }
}