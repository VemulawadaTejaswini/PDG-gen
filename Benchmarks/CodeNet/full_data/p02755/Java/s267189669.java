import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int price;
        double stop;
        int answer = -1;
        if (A > B) {
            price = A * 10;
            stop = (A+1) / 8.0 * 100.0;
        } else {
            price = B * 10;
            stop = (B + 1) / 10.0 * 100.0;
        }
        while (price < stop) {
            double first = price * 0.08;
            double second = price * 0.1;
            if ((int) first == A && (int) second == B) {
                answer = price;
                break;
            }
            price++;
        }
        System.out.println(answer);
    }
}
