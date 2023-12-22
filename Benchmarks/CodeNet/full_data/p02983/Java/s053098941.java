import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		long L = Long.parseLong(tokens[0]);
		long R = Long.parseLong(tokens[1]);
		long result = 0;
		if (R - L >= 2018) {
			result = 0;
		} else {
			List<Long> mods = new ArrayList<>();
			for (long i = L; i < R; ++i) {
				for (long j = i + 1; j <= R; ++j) {
					mods.add((i % 2019) * (j % 2019) % 2019);
				}
			}
			Collections.sort(mods);
			result = mods.get(0);
		}
		System.out.println(result);
		in.close();
	}

}