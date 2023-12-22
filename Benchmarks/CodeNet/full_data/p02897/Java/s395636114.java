import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, Exception{
		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
		int n = getInt(st);
		float ans = 0;
		if (n == 1) {
			ans = 1;
		} else if(n % 2 == 0) {
			ans = 0.50f;
		} else {
			ans = n/2;
			ans = ans/n;
		}
		System.out.println(ans);
	}

	private static int getInt(BufferedReader st) throws Exception, IOException {
		int num = Integer.parseInt(st.readLine());
		return num;
	}
}