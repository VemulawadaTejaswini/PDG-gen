import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		TreeSet<String> input = new TreeSet<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Collections.addAll(input, br.readLine().split(" "));
		System.out.println(input.size() != num ? "NO" : "YES");
	}

}
