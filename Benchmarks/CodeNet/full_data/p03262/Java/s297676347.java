import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] list = br.readLine().split(" ");
			int N = Integer.parseInt(list[0]);
			long X = Long.parseLong(list[1]);
			long[] data = new long[N + 1];
			list = br.readLine().split(" ");
			for (int i = 0; i < N; i++) {
				data[i] = Long.parseLong(list[i]);
			}
			data[N] = X;
			Arrays.sort(data);
			long min = Long.MAX_VALUE;
			for (int i = 1; i <= N; i++) {
				long diff = data[i] - data[i - 1];
				if (min > diff) {
					min = diff;
				}
			}
			System.out.println(min);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}