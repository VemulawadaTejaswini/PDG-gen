import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TEST2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine().contains("7") ? "Yes" : "No");
	}
}
