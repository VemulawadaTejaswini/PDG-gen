import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            int N = S.length();

            long[] sum = new long[1];
            dfs(N - 1, S, sum);

            System.out.println(sum[0]);
        }
    }

    private static void dfs(int index, String s, long[] sum) {
        if (index <= 0) {
            sum[0] += sum(s);
            return;
        }

        dfs(index - 1, s, sum);
        dfs(index - 1, s.substring(0, index) + "+" + s.substring(index), sum);
    }

    private static long sum(String s) {
        long sum = 0;
        for (String split : s.split("\\+")) {
            sum += Long.parseLong(split);
        }
        return sum;
    }

}
