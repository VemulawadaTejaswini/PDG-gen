import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in = new int[4];
		for (int i = 0; i < 4; i++) {
			String line = br.readLine();
			in[i] = Integer.parseInt(line);
		}
		if (in[0] < in[1]) {
			in[1] = in[0];
		}
		System.out.println((in[1] * in[2]) + ((in[0] - in[1]) * in[3]));
	}

}
