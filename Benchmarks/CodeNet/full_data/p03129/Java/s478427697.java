import java.util.Scanner;

class A {
    public static void main(String...args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        System.out.println(N >= 2 * K - 1 ? "YES" : "NO");
    }
}
public class Main {
    public static void main(String...args) {
        A.main();
    }
}
