import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int N;
    private static double[][][] memo;

    private static double rec(int one, int two, int three) {

        // System.out.println("one " + String.valueOf(one) + " two " + String.valueOf(two) + " three " + String.valueOf(three));

        if (memo[one][two][three] > 0){
            return memo[one][two][three];
        }

        if (one == 0 && two == 0 && three == 0) {
            return 0;
        }

        double res = 0;

        res += 1.0 / ((one + two + three) / (double) N); // EP of picking a coin on the first try in the current situation

        if (one > 0) {
            res += (((double) one) / (one + two + three) ) * rec(one - 1, two, three); // the child created by eliminating 1 plate of sushi
            // System.out.println("res of child");
            // System.out.println(res);
        }
        if (two > 0) {
            res += (((double) two) / (one + two + three) ) * rec(one + 1, two - 1, three); // if you remove 1 sushi from a plate with 2 sushis you get one more one sushi plate
        }
        if (three > 0) {
            res += (((double) three) / (one + two + three) ) * rec(one, two + 1, three - 1);
        }

        memo[one][two][three] = res;

        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(f.readLine()); // number of plates

        int oneSushi = 0;
        int twoSushis = 0;
        int threeSushis = 0;

        StringTokenizer st = new StringTokenizer(f.readLine());

        for (int i = 0; i < N; i++) {
            int plate = Integer.parseInt(st.nextToken());
            if (plate == 1) {oneSushi++;}
            else if (plate == 2){twoSushis++;}
            else if (plate == 3){threeSushis++;}
        }

        int totalPlates = oneSushi + twoSushis + threeSushis;

        memo = new double[totalPlates+1][totalPlates+1][totalPlates+1];
        System.out.println(rec(oneSushi, twoSushis, threeSushis));

    }
}