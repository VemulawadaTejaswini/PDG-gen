import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final long DEV_NUM = 1000000000 + 7;

	int[] jumpIndex = null;
	long[] patterns = null;
	int N = 0;

	public void solve() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		int[] color = new int[N];
		for (int i=0; i<N; i++) {
			color[i] = in.nextInt();
		}
		in.close();

		patterns = new long[N];
		Arrays.fill(patterns, -1);
		jumpIndex = new int[N];
		Arrays.fill(jumpIndex, -1);
		int[] beforeIndex = new int[N];
		Arrays.fill(beforeIndex, -1);
		for (int i=0; i<N; i++) {
			int c = color[i];
			if (beforeIndex[c] == -1) {
				beforeIndex[c] = i;
			} else if (beforeIndex[c] == i-1) {
				beforeIndex[c] = i;
			} else {
				jumpIndex[beforeIndex[c]] = i;
				beforeIndex[c] = i;
			}
		}

		for (int i=N-1; i>=1; i--) {
			getPatterns(i);
		}
		long ret = getPatterns(0);
		
		System.out.println(ret);
	}
	
	private long getPatterns(int startIndex) {
		int index;
		long ret = -1;
		
		// searchNextIndex
		for (index = startIndex; index < N ; index++) {
			if (patterns[index] != -1) {
				ret = patterns[index];
				break;
			}
			if (jumpIndex[index] != -1) {
				break;
			}
		}
		if (ret != -1) {
			// Do nothing.
		} else if (index >= N) {
			index = N-1;
			ret = 1;
		} else {
			long unjumpPatterns = getPatterns(index+1);
			long jumpPatterns = getPatterns(jumpIndex[index]);
			
			ret = (unjumpPatterns + jumpPatterns) % DEV_NUM;
		}
		for (int i=startIndex; i<=index; i++) {
			patterns[i] = ret;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}
