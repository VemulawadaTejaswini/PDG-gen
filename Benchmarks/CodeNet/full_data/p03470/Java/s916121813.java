import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Set<Integer> d = new HashSet<>();

		for (int i = 0; i < N; i++) {
			d.add(Integer.parseInt(br.readLine()));
		}

		System.out.println(d.size());
	}

}
