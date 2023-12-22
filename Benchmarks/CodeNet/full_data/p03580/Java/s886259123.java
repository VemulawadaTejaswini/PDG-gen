import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(f.readLine());
		String s = f.readLine();
		ArrayList<Long> blockLengths = new ArrayList<>();
		long count = 0;
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == '1') {
				count++;
			} else {
				blockLengths.add(count);
				count = 0;
			}
		}
		blockLengths.add(count);
		long[] dp = new long[blockLengths.size() + 1];
		for(int i = 2; i <= blockLengths.size(); i++) {
			long prev = blockLengths.get(i - 2);
			long curr = blockLengths.get(i - 1);
			if(prev > 0 && curr > 0) {
				dp[i] = Math.max(dp[i - 1], dp[i - 2] + Math.max(blockLengths.get(i - 2), blockLengths.get(i - 1)));
			} else {
				dp[i] = dp[i - 1];
			}
		}
		long answer = dp[blockLengths.size()];
		//System.out.println(blockLengths);
		//System.out.println(Arrays.toString(dp));
		System.out.println(answer);
	}
}
