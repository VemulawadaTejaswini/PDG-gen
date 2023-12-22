import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();


        int total = 0;

        for (int i = 1; i < n + 1; i++) {
            int sum = sumOfDigits(i);
            if (a <= sum && sum <= b) {
                total += i;
            }
        }
        System.out.println(total);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
