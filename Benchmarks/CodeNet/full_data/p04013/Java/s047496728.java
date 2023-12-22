import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws Exception {
	    String[] inputs = Io.read();

        int[] metas = parse(inputs[0]);
        int[] nums = parse(inputs[1]);

        Dp dp = new Dp(nums);
        Io.write(dp.calc(metas[1]));
    }

    private static int[] parse(String str) {
        String[] split = str.split(" ");
        int[] result = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            result[i] = Integer.parseInt(split[i]);
        }

        return result;
    }
}

class Dp {
    private long[][][] dp;
    private int[] nums;
    private int numMaxLim;

    public Dp(int[] nums) {
        this.nums = nums;
        int maxNum = IntStream.of(nums).max().getAsInt();
        numMaxLim = nums.length * maxNum;

        dp = new long[nums.length + 1][nums.length + 1][numMaxLim + 1];

        for (int i = 0; i <= nums.length; i++) {
            dp[i][0][0] = 1;
        }
    }

    public long calc(int target) {
        long result = 0;
        setupDp();

        for (int j = 1; j <= nums.length; j++) {
            result += dp[nums.length][j][j * target];
        }

        return result;
    }

    private void setupDp() {
        for(int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= nums.length; j++) {
                if (j > i) break;

                for (int k = 1; k <= numMaxLim; k++) {
                    if (nums[i - 1] > k) {
                        dp[i][j][k] = dp[i - 1][j][k];
                    } else {
                        dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - nums[i - 1]];
                    }
                }
            }
        }
    }
}

class Io {

    /**
     * 標準入力から1行ずつ受け取る
     * @return
     * @throws IOException
     */
    public static String[] read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputs = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals(""))
                break;

            inputs.add(line);
        }
        br.close();
        return inputs.toArray(new String[0]);
    }

    /**
     * 標準出力
     * @param answer
     */
    public static void write(long answer)
    {
        System.out.println(answer);
    }
}