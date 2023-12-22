import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	String S;
	int result = 0;

	Main() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		N = Integer.parseInt(in.readLine());
		S = in.readLine();
		in.close();
		calc();
	}

	void calc() {
		boolean replaceMode = false;
		for (int i = 0; i < S.length(); ++i) {
			if (!replaceMode) {
				if (S.charAt(i) == '#') {
					replaceMode = true;
				}
			} else {
				if (S.charAt(i) == '.') {
					++result;
				}
			}
		}

		int result2 = 0;
		for (int i = 0; i + 1 < S.length(); ++i) {
			if (S.charAt(i) == '#') {
				++result2;
			}
		}
		result = Math.min(result, result2);
	}

	public static void main(String[] args) throws IOException {
		Main ins = new Main();
		System.out.println(ins.result);

	}

}