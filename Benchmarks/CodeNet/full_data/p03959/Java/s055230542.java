import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	static class Range {
		int min;
		int max;
		int cert;
		
		Range() {
			cert = 0; max = 0; min = 0;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		int N = Integer.parseInt(s);
		s = r.readLine();
		String[] parts = s.split(" ");
		Range[] heights = new Range[N];
		int pre = 0;
		for (int i = 0; i < N; i++) {
			int curr = Integer.parseInt(parts[i]);
			heights[i] = new Range();
			if (curr > pre) {
				heights[i].cert = curr;
				pre = curr;
			} else {
				heights[i].max = pre;
			}
		}
		s = r.readLine();
		parts = s.split(" ");
		pre = 0;
		for (int i = 0; i < N; i++) {
			int j = N - 1 - i;
			int curr = Integer.parseInt(parts[j]);
			if (curr > pre) {
				if (heights[j].cert != 0) {
					if (heights[j].cert != curr) {
						System.out.println(0);
						System.exit(0);
					}
				}
				heights[j].cert = curr;
				pre = curr;
			} else {
				if (heights[j].max > curr) {
					heights[j].max = curr;
				}
			}
		}
		long res = 1;
		for (int i = 0; i < N; i++) {
			if (heights[i].cert == 0) {
				res *= heights[i].max;
			}
			res %= (int) Math.pow(10, 9) + 7;
		}
		System.out.println(res);
	}

}
