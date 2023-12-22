import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long A;
        long B;
        long C;
        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextLong();
            B = sc.nextLong();
            C = sc.nextLong();
        }

        long AmB = A % B;

        for (int i = 0; i < B; i++) {
            if ((AmB * i) % B == C) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
