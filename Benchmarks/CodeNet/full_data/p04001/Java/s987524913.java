import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	static BufferedReader br;

	public static void main(String[] args) {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String S = br.readLine();
			double length = S.length();
			double sum = 0;
			for (int i = 0; i < length; i++) {
				double left = Math.ceil(Math.pow(2, i - 1));
				for (int j = i + 1; j < length + 1; j++) {
					String s = S.substring(i, j);
					double n = Double.valueOf(s);
					double right = Math.ceil(Math.pow(2, length - j - 1));
					sum += left * n * right;
				}
			}
			if (sum < (double) Integer.MAX_VALUE) {
				int k = (int) sum;
				System.out.println(k);
			} else {
				String total = String.valueOf(sum);
				char[] t = total.toCharArray();
				for (char c : t) {
					if (c == '.') {
						continue;
					}
					if (c == 'E') {
						break;
					}
					System.out.print(c);
				}
			}
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());

		}

	}
}
