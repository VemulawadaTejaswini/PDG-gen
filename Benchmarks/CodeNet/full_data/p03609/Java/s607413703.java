import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// Atcoder用のサンプルプログラム
	public static void main(String[] args) {
		String line = "";
		try {
			line = readLine();

			StringTokenizer st = new StringTokenizer(line, " ");
			String tempK = st.nextToken();
			String tempS = st.nextToken();

			int k = Integer.parseInt(tempK);
			int s = Integer.parseInt(tempS);
			int cnt = 0;

			int result=0;
			if (k -s >= 0) {
				result=k-s;
			} else {
				result=0;
			}
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

}
