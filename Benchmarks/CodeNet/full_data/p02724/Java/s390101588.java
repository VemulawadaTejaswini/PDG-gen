import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		long K = Long.parseLong(in.readLine());
		long result = K / 500 * 1000;
		K = K % 500;
		result += K /  5 * 5;
		System.out.println(result);
	}

	void calc() {
	}

	void showResult() {
	}

}
