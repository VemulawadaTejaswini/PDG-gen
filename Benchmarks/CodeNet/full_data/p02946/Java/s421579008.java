import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int K = in.nextInt();
            int X = in.nextInt();

            StringBuilder res = new StringBuilder();
            for (int x = X - K + 1; x <= X + K - 1; x++) {
                res.append(x).append(" ");
            }

            System.out.println(res.toString().trim());
        }
    }
}
