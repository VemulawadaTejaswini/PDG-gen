package atCoder.ABC137.A;

import java.util.Scanner;

public class plusMinusTimes {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        final int A = sc.nextInt();
        final int B = sc.nextInt();

        int add = numAdds(A, B);
        int minus = numMinus(A, B);
        int times = numTimes(A, B);

        int result1 = compareNumber(add, minus);
        int result2 = compareNumber(add, times);
        int result3 = compareNumber(result1, result2);

        System.out.println("A + B = " + add + ", A - B = " + minus + ", A * B = " + times + "の中で最大の数は" + result3 + "です。");
    }

    static int numAdds(int A, int B) {
        return A + B;
    }

    static int numMinus(int A, int B) {
        return A - B;
    }

    static int numTimes(int A, int B) {
        return A * B;
    }

    static int compareNumber(int A, int B) {
        if (A > B) {
            return A;
        } else if (B > A) {
            return B;
        } else {
            return A;
        }
    }
}
