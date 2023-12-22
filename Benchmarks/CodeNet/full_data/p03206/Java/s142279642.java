import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int d = Integer.parseInt(br.readLine());

		if (d == 25) {
			System.out.println("Christmas");
		} else if (d == 24) {
			System.out.println("Christmas Eve");
		} else if (d == 23) {
			System.out.println("Christmas Eve Eve");
		} else if (d == 22) {
			System.out.println("Christmas Eve Eve Eve");
		}
	}
}