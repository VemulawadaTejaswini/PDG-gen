import java.util.*;

class Main {
    static int findSumOfigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int A = stdin.nextInt();
        int B = stdin.nextInt();
        int sumAB = 0;
        int lShift = 0;
        int sumD = 0;

        for (int n = 1; n <= N; n++) {
            sumD = findSumOfigits(n);
            if (sumD >= A && sumD <= B) {
                sumAB += n;
            }
        }
        System.out.println(sumAB);
    }
}
