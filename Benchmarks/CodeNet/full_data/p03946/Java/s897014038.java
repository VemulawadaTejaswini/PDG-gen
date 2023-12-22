import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int t = Integer.parseInt(line[1]);
		line = br.readLine().split(" ");
		int cost[] = new int[line.length];
		for (int i = 0; i < line.length; i++) {
			cost[i] = Integer.parseInt(line[i]);
		}
		int data[] = new int[3];
		data = maxPro(cost, t);
		int dam = 0;
		int prof = data[0];
		int lP = data[1];
		int hP = data[2];
		int cosL[] = cost;
		int cosH[] = cost;
		while (true) {
			dam++;
			cosL[lP]++;
			data = maxPro(cosL, t);
			if (data[0] < prof) {
				System.out.println(dam);
				return;
			}
			lP = data[1];
			cosH[hP]--;
			data = maxPro(cosH, t);
			if (data[0] < prof) {
				System.out.println(dam);
				return;
			}
			hP = data[2];
		}

	}
	static int[] maxPro(int[] cost, int t) {
		int max = cost[1] - cost[0];
		int maxp[] = {0, 1};
		for (int i = 0; i < cost.length; i++) {
			for (int k = i+1; k < cost.length; k++) {
				if (cost[k] - cost[i] > max) {
					max = cost[k] - cost[i];
					maxp[0] = i;
					maxp[1] = k;
				}
			}
		}
		int ret[] = {(t * max), maxp[0], maxp[1]};
		return ret;
	}
}