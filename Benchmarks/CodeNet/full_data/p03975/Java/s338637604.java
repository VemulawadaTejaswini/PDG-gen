package atcorder1610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KUPC2016A {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String nab;
		try {
			nab = br.readLine();
			System.out.println(serch(nab));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static int serch(String nab) {

		String[] strArray = nab.split(" ");

		int i = 0;

		int[] num = new int[3];

		for (String str : strArray) {
			num[i] = Integer.parseInt(str);
			i++;
		}

		int ans = num[0];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int j = 0; j < num[0]; j++) {
			int t;
			try {
				t = Integer.parseInt(br.readLine());
				if (num[1] <= t && t >= num[2]) {
					ans--;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return ans;
	}

}
