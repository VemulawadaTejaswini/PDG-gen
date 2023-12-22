import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static int[] make_div_point(int state, int H) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i = 0; i < (H - 1); i++) {
			if(((state >> i) & 1) == 1) {
				set.add(i + 1);
			}
		}
		set.add(0);
		set.add(H);
		int[] ans = new int[set.size()];
		int i = 0;
		while(!set.isEmpty()) {
			ans[i] = set.pollFirst();
			i++;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt(), K = sc.nextInt();
		int[][] S = new int[H][W];
		for(int i = 0; i < H; i++) {
			String str = sc.next();
			for(int j = 0; j < W; j++) S[i][j] = str.charAt(j) - '0';
		}

		int ans = H + W;
		// check all patter in H
		for(int ptn = 0; ptn < (1 << (H - 1)); ptn++) {
			// encode ptn
			int num_block = Integer.bitCount(ptn) + 1;	// number of blocks after dividing
			int[] white_counter = new int[num_block];	// number of white choco in each blocks
			Arrays.fill(white_counter, 0);
			int[] div_point = make_div_point(ptn, H);	// array of split point
			int div_count = 0;
			boolean impossible = false;					// over K...

			// cutting greedy
			for(int i = 0; i < W; i++) {
				// need splitting ?
				boolean need_splitting = false;
				for(int d = 0; d < num_block; d++) {
					int sum = 0;
					for(int j = div_point[d]; j < div_point[d + 1]; j++) sum += S[j][i];
					if(sum > K) {
						impossible = true;
						break;
					}
					if(white_counter[d] + sum > K) {
						need_splitting = true;
						break;
					}
				}
				if(impossible) break;

				// if need -> splitting
				if(need_splitting) {
					Arrays.fill(white_counter, 0);
					div_count++;
				}
				for(int d = 0; d < num_block; d++) {
					int sum = 0;
					for(int j = div_point[d]; j < div_point[d + 1]; j++) sum += S[j][i];
					white_counter[d] += sum;
				}
			}

			// update answer
			if(impossible) continue;
			ans = Math.min(ans, div_count + num_block - 1);
		}

		// output answer
		System.out.println(ans);
	}
}