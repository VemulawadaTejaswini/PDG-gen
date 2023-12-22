import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		double count = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken());
			String u = st.nextToken();
			if (u.equals("BTC")) {
				x *= 380000.0;
				count += x;
			}
			else if (u.equals("JPY")) {
				count += x;
			}
		}
		System.out.println(count);
	}

}