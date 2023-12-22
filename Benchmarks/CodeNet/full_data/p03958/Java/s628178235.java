import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		String[] parts = s.split(" ");
		int K = Integer.parseInt(parts[0]);
		int T = Integer.parseInt(parts[1]);
		s = r.readLine();
		parts = s.split(" ");
		int max = 0;
		for (int i = 0; i < T; i++) {
			int curr = Integer.parseInt(parts[i]);
			if (curr > max) {
				max = curr;
			}
		}
		boolean pre = false;
		int count = K - max;
		for (int i = 0; i < K; i++) {
			if (!pre && max > 0) {
				max--;
				pre = true;
			} else if (count > 0){
				pre = false;
				count--;
			}
		}
		System.out.println(max);
	}

}
