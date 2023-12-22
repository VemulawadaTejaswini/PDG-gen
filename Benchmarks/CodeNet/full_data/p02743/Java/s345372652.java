import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        double sqrtA = Math.sqrt(a);
        double sqrtB = Math.sqrt(b);
        double sqrtC = Math.sqrt(c);


        double sqrtA2 = (sqrtA + a / sqrtA) / 2.0;
        double sqrtB2 = (sqrtB + b / sqrtB) / 2.0;
        double sqrtC2 = (sqrtC + c / sqrtC) / 2.0;

        double sqrtA3 = (sqrtA2 + a / sqrtA2) / 2.0;
        double sqrtB3 = (sqrtB2 + b / sqrtB2) / 2.0;
        double sqrtC3 = (sqrtC2 + c / sqrtC2) / 2.0;

        if (sqrtA3 + sqrtB3 < sqrtC3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
