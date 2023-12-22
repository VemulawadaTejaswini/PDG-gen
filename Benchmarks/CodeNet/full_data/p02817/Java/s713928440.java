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

        for (int i = 0; i < K; i++) {
            if (A == 0 && B == 0) {
                break;
            }

            if (A >= 1) {
                A -= 1;
            } else if (B >= 1) {
                B -= 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.append(" ");
        sb.append(B);

        System.out.println(sb.toString());
    }
}
