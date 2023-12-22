import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int digit = 0;
            for (; N > 0;) {
                N = N / K;
                digit++;
            }

            System.out.println(digit);
        }
    }
}