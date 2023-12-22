import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char str[] = br.readLine().toCharArray();

		int alph1[] = new int[26];
		int alph2[] = new int[26];

		for (int i = 0; i < str.length; i++) {
			alph1[str[i] - 'a']++;
		}

		str = br.readLine().toCharArray();

		for (int i = 0; i < str.length; i++) {
			alph2[str[i] - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if ((alph1[i] == 0 && alph2[i] != 0) || (alph1[i] != 0 && alph2[i] == 0)) {
				continue;
			}
			if (alph1[i] == 0 && alph2[i] == 0)
				continue;
			if (alph1[i] != alph2[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
