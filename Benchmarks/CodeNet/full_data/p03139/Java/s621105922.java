import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int a = Math.min(A, B);
        int b = Math.abs(N - A - B);
        System.out.println(Math.max(a, b) + " " + Math.min(a, b));
    }
}