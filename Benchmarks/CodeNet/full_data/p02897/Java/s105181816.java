import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sysin.readLine());
		int odd = ( n + 1 ) / 2;
		System.out.println(((double) odd)/n);
	}
}