import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int A = in.nextInt();
        String op = in.next();
        int B = in.nextInt();
        if ("+".equals(op)) {
            System.out.println(A + B);
        } else {
            System.out.println(A - B);
        }
    }
}