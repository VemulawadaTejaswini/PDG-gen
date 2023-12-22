import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int x = Integer.parseInt(str[0]);
		int a = Integer.parseInt(str[1]);

		if (x < a) {
			System.out.println("0");
		} else {
			System.out.println("10");
		}
	}
}
