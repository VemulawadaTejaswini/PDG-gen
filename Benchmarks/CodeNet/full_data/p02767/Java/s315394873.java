import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int[] nums = new int[num];
        int min = 101, max = 0;
        for (int i = 0; i < num; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
            max = max > nums[i] ? max : nums[i];
            min = min < nums[i] ? min : nums[i];
        }

        int ans = 1000001;
        for (int i = min; i <= max; i++) {
            int sum = 0;
            for (int j = 0; j < num; j++) {
                int diff = nums[j] - i;
                sum += diff * diff;
            }
            ans = sum > ans ? ans : sum;
        }

        pw.println(ans);
        pw.flush();
    }
}