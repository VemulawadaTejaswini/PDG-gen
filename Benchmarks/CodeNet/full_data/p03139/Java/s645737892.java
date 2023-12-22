import java.util.Scanner;

class A {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        System.out.println(Math.min(A, B) + " " + Math.max(A + B - N, 0));
    }
}
public class Main {
    public static void main(String... args) {
        A.main();
    }
}
