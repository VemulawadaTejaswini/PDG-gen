import java.util.Scanner;

public class Main {
    static int A;
    static int B;
    static int C;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        scanner.close();

        if(A - B <= C) {
            System.out.println(C - (A - B));
        } else {
            System.out.println(0);
        }
    }
}