import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        double allProb = 0.0000000;

        double baseProb = 1.00000 / (double) N;
        int remainVals = 0;

        for (int i = 1; i <= N; i++) {
            int takeCoins = getNeedTakeCoins(Double.parseDouble(String.valueOf(i)), K);
            if (takeCoins == 0) {
                remainVals = N - i + 1;
                break;
            }
            allProb += baseProb * Math.pow(0.5000, takeCoins);
        }

        if (remainVals > 0) {
            allProb += baseProb * remainVals;
        }

        System.out.println(allProb);

    }

    public static int getNeedTakeCoins(double val, double K) {
        int ret = 0;
        boolean times = false;
        while (true) {
            if (val >= K) {
                break;
            }
            val *= 4;
            ret += 2.00;
            times = true;
        }
        if (val / 2.00 >= K && times) {
            ret -= 1;
        }
        return ret;
    }
}
