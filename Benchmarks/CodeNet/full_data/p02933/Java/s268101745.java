
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int a = Integer.parseInt(in.readLine());
		String s = in.readLine();

		if (a >= 3200) {
			System.out.println(s);
		} else {
			System.out.println("red");
		}

	}
}
