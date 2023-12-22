import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    static final long MAX_IDX = 10000000;
    static long[] dp = new long[(int)MAX_IDX + 1];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        long H = Long.parseLong(in1[0]);
        long N = Long.parseLong(in1[1]);
        List<Long> A = new ArrayList<>();
        List<Long> B = new ArrayList<>();
        for(int i = 0; i < N; i++){
            in1 = br.readLine().split(" ");
            A.add(Long.parseLong(in1[0]));
            B.add(Long.parseLong(in1[1]));
        }
        br.close();

        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0L;

        for(int n = 0; n < N; n++){
            long atk = A.get(n);
            long mpt = B.get(n);

            for(int h = 0; h < H; h++){
                if(dp[h] == Long.MAX_VALUE) continue;

                long next_h = h + atk;
                if(next_h >= H) next_h = H;

                dp[(int)next_h] = Math.min(dp[(int)next_h], dp[h] + mpt);
            }
        }

        System.out.println(dp[(int)H]);
    }
}