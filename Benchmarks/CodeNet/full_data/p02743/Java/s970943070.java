import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	long a, b, c;
	boolean cond = true;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		a = Long.parseLong(tokens[0]);
		b = Long.parseLong(tokens[1]);
		c = Long.parseLong(tokens[2]);

	}

	void calc() {
		BigDecimal right = new BigDecimal(c - a - b);
		right = right.multiply(right);
		BigDecimal A = new BigDecimal(4L * a);
		BigDecimal B = new BigDecimal(b);
		BigDecimal left = A.multiply(B);
		if(left.compareTo(right ) < 0) {
			cond = true;
		}else {
			cond = false;
		}
	}

	void showResult() {
		System.out.println((cond ? "Yes" : "No"));
	}

}
