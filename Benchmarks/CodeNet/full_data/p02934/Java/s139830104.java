import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            double sum = 0;
            for (int i = 0; i < n; i++) {
                double ii = sc.nextInt();
                sum += 1.0 / ii;
            }
            System.out.println(1.0 / sum);
        }
    }
}