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
		if((S.charAt(2) == S.charAt(3)) && (S.charAt(4)== S.charAt(5))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");			
		}
	}

	void calc() {
	}

	void showResult() {
	}

}
