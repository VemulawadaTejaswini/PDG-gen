import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] abc = br.readLine().split(" ");
		br.close();

		int ab = Integer.parseInt(abc[0]);
		int bc = Integer.parseInt(abc[1]);
		System.out.println(ab * bc / 2);
	}
}
