
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n;
		long ans = 0;
		String str;
		str = bf.readLine();
		n = Integer.parseInt(str);
		ans = n*(n-1)/2;
		System.out.println(ans);
	}
}