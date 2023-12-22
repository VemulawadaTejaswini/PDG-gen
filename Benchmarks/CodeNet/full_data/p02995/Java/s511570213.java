import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String[] tokens = in.readLine().split(" ");
		long A = Long.parseLong(tokens[0]);
		long B = Long.parseLong(tokens[1]);
		long C = Long.parseLong(tokens[2]);
		long D = Long.parseLong(tokens[3]);
		long result = 0;
		result += B / C;
		result += B / D;
		result -= B / (C * D / gcd(D, C));
		long result2 = (A - 1) / C;
		result2 += (A - 1) / D;
		result2 -= (A - 1) / (C * D / gcd(D, C));
		result -= result2;
		long result3 = B - A + 1 - result;
		System.out.println(result3);
		in.close();
	}

	static long gcd(long large, long small) {
		if (large == small) {
			return small;
		}else if(large % small == 0) {
			return small;
		} else {
			large = large % small;
			return gcd(small, large);
		}
	}
}
