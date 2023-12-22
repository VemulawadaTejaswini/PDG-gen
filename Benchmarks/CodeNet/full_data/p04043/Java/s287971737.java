package AtCoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split(" ");

		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < 3; i++) {
			if (Integer.parseInt(array[i]) == 5) {
				count1 += 1;
			} else if (Integer.parseInt(array[i]) == 7) {
				count2 += 1;
			}
		}
		if (count1 == 2 && count2 == 1) {
			System.out.println("YES");
		} else {
			System.out.print("NO");
		}
	}
}
