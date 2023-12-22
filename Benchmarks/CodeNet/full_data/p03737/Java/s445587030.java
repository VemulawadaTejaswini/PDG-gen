import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split(" ");

		char a = (array[0]).charAt(0);
		char b = (array[1]).charAt(0);
		char c = (array[2]).charAt(0);

		String x = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);

		System.out.println(x.toUpperCase());

	}
}