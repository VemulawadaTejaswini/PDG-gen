import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int negativeNumCnt = 0;
        long min = -1;
        long prevAbs = -1;
        long absSum = 0;
        boolean hasZero = false;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                hasZero = true;
            }
            if (A[i] < 0) {
                negativeNumCnt++;
            }
            long currentAbs = Math.abs(A[i]);
            absSum += currentAbs;
            if (A[i] != 0 && currentAbs < prevAbs) {
                min = currentAbs;
            }
            prevAbs = currentAbs;
        }

        if (negativeNumCnt %2 == 0 || hasZero == true) {
            System.out.println(absSum);
        }
        else {
            long max = absSum - min * 2;
            System.out.println(max);
        }
    }
}