import java.util.*;

public class Main {
    private static int[] costs = new int[]{-1, 2, 5, 5, 4, 5, 6, 3, 7, 6};

    private static class RunLenNum implements Comparable<RunLenNum> {
        private int totLen;
        private int[] numCounts;

        public RunLenNum() {
            this.totLen = 0;
            this.numCounts = new int[10];
        }

        public RunLenNum addNum(int num) {
            RunLenNum res = new RunLenNum();
            res.totLen = totLen + 1;
            res.numCounts = Arrays.copyOf(numCounts, numCounts.length);
            res.numCounts[num]++;

            return res;
        }

        @Override
        public int compareTo(RunLenNum o) {
            if (o == null)
                return 1;

            if (totLen != o.totLen)
                return Integer.compare(totLen, o.totLen);

            for (int i = 9; i > 0; i--) {
                if (numCounts[i] != o.numCounts[i])
                    return Integer.compare(numCounts[i], o.numCounts[i]);
            }

            return 0;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            for (int i = 9; i > 0; i--) {
                if (numCounts[i] == 0)
                    continue;

                for (int j = 0; j < numCounts[i]; j++) {
                    sb.append(i);
                }
            }

            return sb.toString();
        }
    }

    private static RunLenNum findBest(RunLenNum[] memo, int minDigits, int n, List<Integer> digits) {
        if (n < minDigits)
            return null;

        if (memo[n] != null)
            return memo[n];

        ArrayList<RunLenNum> choices = new ArrayList<>();

        for (int d : digits) {
            if (costs[d] == n)
                choices.add(new RunLenNum().addNum(d));
        }

        for (int d : digits) {
            RunLenNum bestWithoutThis = findBest(memo, minDigits, n - costs[d], digits);

            if (bestWithoutThis != null)
                choices.add(bestWithoutThis.addNum(d));
        }

        if (choices.size() == 0)
            memo[n] = null;
        else
            memo[n] = Collections.max(choices);

        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        ArrayList<Integer> ds = new ArrayList<>(m);

        for (int i = 0; i < m; i++) {
            ds.add(sc.nextInt());
        }

        int minDigits = 10;

        for (int d : ds) {
            minDigits = Math.min(minDigits, costs[d]);
        }

        RunLenNum[] memo = new RunLenNum[Math.max(10, n + 1)];

        System.out.println(findBest(memo, minDigits, n, ds));
    }
}