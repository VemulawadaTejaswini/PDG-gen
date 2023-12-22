import java.util.*;

// https://atcoder.jp/contests/dp/tasks/dp_a
public class Main {
    public static void main(String args[]) {
        runCode();
    }

    private static void runCode() {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int[][] days = new int[n][];
            for (int i = 0; i < n; i++) {
                days[i] = new int[] {
                  scan.nextInt(),
                  scan.nextInt(),
                  scan.nextInt()
                };
            }
            System.out.println(new UsingDP().maxHappiness(days));
        }
    }
    

    public static class UsingDP {
        public int maxHappiness(int[][] days) {
            int[] happiness = days[0], temp = new int[happiness.length];
            for (int day = 1; day < days.length; ++day) {
                int[] activities = days[day];
                //System.out.println(day);
                //System.out.println(Arrays.toString(happiness));
                //System.out.println(Arrays.toString(activities));
                for (int i = 0; i < 3; ++i) {
                    for (int j = 0; j < 3; ++j) {
                        if (i == j) continue;
                         temp[i] = Math.max(temp[i], happiness[j] + activities[i]);
                    } 
                }
                //System.out.println(Arrays.toString(temp));
                int[] swap = happiness;
                happiness = temp;
                temp = swap;
            }
            //System.out.println(Arrays.toString(happiness));
            int ans = 0;
            for (int i = 0; i < happiness.length; ++i)
               ans = Math.max(ans, happiness[i]);
            return ans;
        }
    }
}
