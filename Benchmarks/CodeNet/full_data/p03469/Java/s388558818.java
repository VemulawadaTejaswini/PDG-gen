import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) {

		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		try(BufferedReader br = new BufferedReader(reader)) {
			char[] c = br.readLine().toCharArray();
			c[3] = '8';
			System.out.println(new String(c));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
