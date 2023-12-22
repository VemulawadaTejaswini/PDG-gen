import java.util.Scanner;

class A {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        if (A <= 8 && B <= 8)
            System.out.println("Yay!");
        else
            System.out.println(":(");
    }
}
public class Main {
    public static void main(String...args) {
        A.main();
    }
}