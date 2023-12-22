import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Range[] ranges = new Range[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int l = sc.nextInt();
            Range range = new Range(x + l, x - l);
            ranges[i] = range;
        }
        Arrays.sort(ranges, new SortByHigh());
        int[] dp = new int[n];
        dp[0] = ranges[0].high;
        int count = 1;
        for (int i = 1; i < n ; i++) {
            if (dp[i - 1] <= ranges[i].low) {
                dp[i] = ranges[i].high;
                count++;
            }
        }
        System.out.println(count);
    }
    public static class Range {
        int high;
        int low;
        public Range(int high, int low){
            this.high = high;
            this.low = low;
        }
    }
    public static class SortByHigh implements Comparator<Range> {

        public int compare(Range a, Range b) {
            return a.high - b.high;
        }
    }

}
