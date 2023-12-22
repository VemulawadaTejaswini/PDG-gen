import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }

        int a = findRank(p,n);
        int b = findRank(q,n);
        System.out.println(Math.abs(a - b));

    }

    public static int fac(int n) {
        int res = 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        return res;
    }

    public static int findSmallerInRight(int[] array, int low, int high) {
        int countRight = 0, i;

        for (i = low + 1; i <= high; i++)
            if (array[i] < array[low])
                countRight++;

        return countRight;
    }

    public static int findRank(int[] array, int length) {
        int mul = fac(length);
        int rank = 1;
        int countRight;

        for (int i = 0; i < length; ++i) {
            mul /= length - i;

            countRight = findSmallerInRight(array, i, length - 1);

            rank += countRight * mul;
        }

        return rank;
    }
}