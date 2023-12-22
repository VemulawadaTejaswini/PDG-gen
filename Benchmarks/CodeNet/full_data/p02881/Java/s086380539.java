import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        List<long[]> ansList = new ArrayList<>();

        for (long i = 1; i <= N; i++) {
            if (N % i == 0) {
                long a = N / i;
                long[] ans = new long[]{a, i};
                ansList.add(ans);
            }
        }

        long result = Long.MAX_VALUE;

        for (long[] ans : ansList) {
            long x = ans[0];
            long y = ans[1];
            long tmpResult = (x - 1) + (y - 1);
            result = Math.min(result, tmpResult);
        }


        System.out.println(result);

    }

}

