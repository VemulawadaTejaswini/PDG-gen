import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String args[]) {

		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			// ----- input -----
			final int L1[] = readLine(input.readLine());
			final int N = L1[0];
			final int M = L1[1];

			// final int DATA[][] = lines(input.lines(), ROW, COL);
			final int DATA[][] = readLines(input, N);
			List<int[]> DATA_LIST = new LinkedList<>(Arrays.asList(DATA));

			// ----- main -----
			BigDecimal total = new BigDecimal(0);
			int calcCnt = 0;
			int cnt = 0;

			while(true) {
				int[] minStore = DATA_LIST.parallelStream().min( (a,b) -> a[0] - b[0]).get();
				DATA_LIST.remove(minStore);
				// DATA_LIST.removeIf(d -> d[0] == minStore[0] && d[1] == minStore[1]);
				calcCnt =(cnt + minStore[1] > M) ? M - cnt : minStore[1];
				total = total.add(BigDecimal.valueOf(calcCnt).multiply(BigDecimal.valueOf(minStore[0])));
				cnt += calcCnt;
				if(M <= cnt)break;
			}
			System.out.println(total);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static int[] readLine(String line) {

		String[] vals = line.split(" ");
		int[] data = new int[vals.length];
		int i = 0;

		try {
			for(String val : vals) {
				data[i++] = Integer.parseInt(val);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	private static int[][] readLines(BufferedReader input, int num){

		int[][] data = new int[num][];
		for(int i=0; i < num; i++) {
			try {
				data[i] = readLine(input.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return data;
	}
}