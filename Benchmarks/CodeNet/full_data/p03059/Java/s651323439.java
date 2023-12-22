import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        int b = sc.nextInt();
        double t = sc.nextInt();
        int total = 0;
        double sum = 0;

        for (int i = 1; sum < t + 0.5; i++) {
            sum = i * a;
            if (sum < t + 0.5)
                total += b;
        }
        System.out.println(total);
    }
}