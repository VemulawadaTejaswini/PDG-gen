import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = solve(i);
            if (num >= a && num <= b) {
                sum += i;
            }
        }

        System.out.println(sum);

    }

    private static int solve(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}