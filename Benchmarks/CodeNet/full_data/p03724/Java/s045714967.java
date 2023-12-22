import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {

		int n;
		int m;
		int[] pArr = new int[1];

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line;

			line = br.readLine();
			{
				String[] tokens = line.split(" ");
				n = Integer.parseInt(tokens[0]);
				m = Integer.parseInt(tokens[1]);
			}

			pArr = new int[n];
			for (int i = 0; i < n; i++) {
				pArr[i] = 0;
			}

			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(" ");
				int a = Integer.parseInt(tokens[0]);
				int b = Integer.parseInt(tokens[1]);

				pArr[a - 1]++;
				pArr[b - 1]++;
			}
		}

		for (int i = 0; i < n; i++) {
			if (pArr[i] % 2 == 1) {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}
}