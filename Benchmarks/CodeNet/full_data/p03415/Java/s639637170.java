import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String c[] = new String[3];
		c[0] = br.readLine().substring(0, 1);
		c[1] = br.readLine().substring(1, 2);
		c[2] = br.readLine().substring(2, 3);
		System.out.println(c[0] + c[1] + c[2]);
	}
}