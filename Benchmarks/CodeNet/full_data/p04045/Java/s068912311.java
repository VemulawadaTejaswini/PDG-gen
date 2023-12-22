import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		int d[] = new int[k];
		str = br.readLine().split(" ");

		for (int i = 0; i < k; i++) {
			d[i] = Integer.parseInt(str[i]);
		}

		for (int i = n; i < 10000; i++) {
			String s[] = String.valueOf(i).split("");
			boolean flag = false;

			for (int j = 0; j < s.length; j++) {
				for (int l = 0; l < d.length; l++) {
					if (s[j].equals(String.valueOf(d[l]))) {
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				}
			}
			if (flag) {
				continue;
			} else {
				System.out.println(i);
				return;
			}
		}
	}
}
