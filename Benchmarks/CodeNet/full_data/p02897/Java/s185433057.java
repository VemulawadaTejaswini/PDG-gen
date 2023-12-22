import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            double result = 1 / 2;
            System.out.println(result);
        } else {
            double result = (n + 1) / (2 * n);
            System.out.println(result);
        }
        sc.close();
    }
}