import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, Exception{
		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
		int n = getInt(st);
		double ans = 0;
		if (n == 1) {
			ans = 1;
		} else if(n % 2 == 0) {
			ans = 0.50d;
		} else {
			ans = n/2 + 1;
			ans = ans/n;
		}
		System.out.println(ans);
	}

	private static int getInt(BufferedReader st) throws Exception, IOException {
		int num = Integer.parseInt(st.readLine());
		return num;
	}
}