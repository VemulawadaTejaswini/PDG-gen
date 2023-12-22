import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();

            for (int A = 1; A <= 9; A++) {
                for (int B = 1; B <= 9; B++) {
                    if (A * B == N) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }

            System.out.println("No");
        }
    }
}
