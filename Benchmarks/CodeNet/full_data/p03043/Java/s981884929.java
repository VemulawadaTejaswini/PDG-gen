import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double a = k / (double)i;
            double value2 = k <= i ? 1 : Math.pow(0.5, Math.ceil(Math.log(a) / Math.log(2)));
            double value3 = 1.0f / n;
            sum +=  value3 * value2;
        }
        System.out.println(sum);
    }
}
