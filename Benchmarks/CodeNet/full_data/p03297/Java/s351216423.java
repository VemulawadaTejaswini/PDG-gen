import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	/* --------------------------------------------------------------------
	   main
	 * -------------------------------------------------------------------- */
	public static void main(String args[]) {

		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {

			// ----- input -----
			final int line1[] = InputUtil.readLine(input.readLine());
			final int row = line1[0];

			//  ----- data -----
			Queue<Data> data = InputUtil.getQueue(input, row);

			// ----- main -----
			long zaiko = 0;
			long add = 0;
			long firstZaiko = 0;
			long work = 0;
			for(int i=0; i < row; i++) {

				boolean ans = false;
				Data d = data.poll();


				if(d.val[0] < d.val[1]) {
					ans = false;
				} else if(d.val[1] <= d.val[2] && d.val[1] <= d.val[3]) {
					ans = true;
				} else {

					// 在庫計算
					zaiko = d.val[0];
					if(d.val[0] > d.val[1] && d.val[0] > d.val[2]) {
						work = d.val[0] % d.val[1];
						zaiko = work;
						while(true) {
							if(zaiko > d.val[0]) {
								zaiko = d.val[0];
								break;
							}
							if(zaiko > d.val[2]) {
								break;
							}
							zaiko += d.val[1];
						}
					}
					add = d.val[3];
					if(d.val[3] > d.val[1] && d.val[3] > d.val[2]) {
						work = d.val[3] % d.val[1];
						add = work;
						while(true) {
							if(add > d.val[3]) {
								add = d.val[3];
								break;
							}
							if(add > d.val[2]) {
								break;
							}
							add += d.val[1];
						}
					}

					firstZaiko = zaiko;

					while(true) {

						// 昼
						zaiko -= d.val[1];
						if(zaiko < 0) {
							break;
						}

						// 夜
						if(zaiko <= d.val[2]) {
							zaiko += add;
						}

						if(zaiko == firstZaiko) {
							ans = true;
							break;
						}
					}
				}
				System.out.println(ans?"Yes":"No");

			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/* --------------------------------------------------------------------
	 * inupt class
	 * -------------------------------------------------------------------- */
	static class InputUtil {

		// line
		public static int[] readLine(String line) {

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

		// 縦 data
		public static Queue<Data> getQueue(BufferedReader input, int num) {

			// Queue<Data> data = new PriorityQueue<>();	// sort
			Queue<Data> data = new ArrayDeque<>();			// fifo
			try {
				for(int i=0; i < num; i++) {
					data.add(new Data(input.readLine().split(" ")));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return data;
		}
	}

	/* --------------------------------------------------------------------
	 * data class
	 * -------------------------------------------------------------------- */
	static class Data{
		public long[] val;

		public Data(String[] values) {
			val = new long[values.length];
			for(int i=0; i < values.length; i++) {
				val[i] = Long.parseLong(values[i]);
			}
		}

		public Data(String value) {
			val = new long[1];
			val[0] = Long.parseLong(value);
		}
	}
}