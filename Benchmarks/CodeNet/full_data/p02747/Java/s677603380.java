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
		String S = in.readLine();
		boolean result = false;
		if (S.length() % 2 != 0) {
			// 違う
		} else {
			int count = S.length() / 2;
			StringBuilder strBuilder = new StringBuilder();
			for(int i = 0; i < count; ++i) {
				strBuilder.append("hi");
			}
			String str = strBuilder.toString();
			if(S.equals(str)) {
				result = true;
			}
		}
		System.out.println((result ? "Yes" : "No"));
	}

	void calc() {
	}

	void showResult() {
	}

}
