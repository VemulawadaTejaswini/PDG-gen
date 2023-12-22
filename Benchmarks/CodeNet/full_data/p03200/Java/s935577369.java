import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		int ans = 0;
		int count = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("W")) {
				ans += count;
			} else {
				count++;
			}
		}
		System.out.println(ans);
	}
}
