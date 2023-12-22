import java.util.*;

public class Main {
    public static void main(String[] args) {
//        test();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arrayA = new long[N];
        long[] arrayB = new long[N];

        for (int i = 0; i < N; i++) {
            arrayA[i] = sc.nextLong();
            arrayB[i] = sc.nextLong();
        }

        System.out.println(calc(arrayA, arrayB));
    }

    private static long calc(long[] arrayA, long[] arrayB) {
        int ind = arrayA.length - 1;
        long a, b, inc;
        long count = 0;
        while (ind >= 0) {
            a = arrayA[ind] + count;
            b = arrayB[ind];
            if (a % b == 0) {
                inc = 0;
            } else {
                long d = a / b;
                inc = b-(a-b*d);
            }
            count += inc;

            ind--;
        }
        return count;
    }


    private static void test() {
        assert calc(new long[] {3,2,9}, new long[] {5,7,4}) == 7;
        assert calc(new long[] {3,4,5,2,5,5,9}, new long[] {1,1,9,6,3,8,7}) == 22;
    }
}
