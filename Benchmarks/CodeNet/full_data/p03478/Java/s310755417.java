import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int res = 0;

        for (int i = 0; i <= N; i++) {
            int sumDigits = calcSumOfDigits(i);
            if (A <= sumDigits && sumDigits <= B) {
                res += i;
            }
        }
        System.out.println(res);
    }

    private static int calcSumOfDigits(int i) {
        int tmp = i;
        int sumDigits = 0;
        while (tmp > 0) {
            sumDigits += tmp % 10;
            tmp /= 10;
        }
        return sumDigits;
    }
}
