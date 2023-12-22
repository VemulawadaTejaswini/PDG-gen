import java.util.Scanner;

public class Main {

    private static Scanner prepareInput() {
        return new Scanner(System.in);
    }

    public static void main(String... args) {
        Scanner sc = prepareInput();
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long K = Long.parseLong(sc.next());

        if (K <= A) {
            A = A - K;
        } else if (K <= A + B) {
            A = 0;
            B = B - (K - A);
        } else {
            A = 0;
            B = 0;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.append(" ");
        sb.append(B);

        System.out.println(sb.toString());
    }
}
