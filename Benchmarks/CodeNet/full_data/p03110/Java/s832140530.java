import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double amount = sc.nextDouble();

            String type = sc.next();

            if (type.equals("BTC")) {
                amount *= 380000;
            }

            sum += amount;
        }

        System.out.println(sum);
    }
}