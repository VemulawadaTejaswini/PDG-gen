import java.io.*;

public class　Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		System.out.println(x.charAt(0) == x.charAt(2) ? "Yes" : "No");

	}
}