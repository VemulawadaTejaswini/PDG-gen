
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        double answer = 0;

        for (int i = 0 ; i < N ; i++) {
            double A = scanner.nextDouble();
            answer += 1.0 / A;
        }

        answer = 1.0 / answer;

        System.out.println(answer);
    }
}
