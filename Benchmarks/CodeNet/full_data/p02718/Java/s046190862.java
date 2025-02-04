import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        int sum = 0;

        inputs = br.readLine().split(" ");
        int[] nums = new int[num];
        for(int i = 0; i < num; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
            sum += nums[i];
        }

        String ans = "Yes";
        Arrays.sort(nums);
        if(nums[n-m] < sum / 4 / m) {
            ans = "No";
        }

        pw.println(ans);
        pw.flush();
    }
}