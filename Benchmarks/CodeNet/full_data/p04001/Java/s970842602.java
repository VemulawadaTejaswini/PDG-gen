import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	static BufferedReader br;

	public static void main(String[] args) {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String S = br.readLine();
			long length = S.length();
			long sum = 0;
			for (int i = 0; i < length; i++) {
				long left = (long) Math.ceil(Math.pow(2, i - 1));
				for (int j = i + 1; j < length + 1; j++) {
					sum += (long) Long.valueOf(S.substring(i, j))
							* Math.ceil(Math.pow(2, length - j - 1));
				}
				sum *= left;
			}
			System.out.println(sum);
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());
		}
	}
}
