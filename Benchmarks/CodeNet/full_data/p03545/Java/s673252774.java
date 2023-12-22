import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.LongSupplier;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String str[] = line.split("");
		int n = str.length;
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(str[i]);
		}

		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();

		for (int bit = 0; bit < (1 << (n - 1)); bit++) {
			list.add(new ArrayList<String>());
			for (int i = 0; i < n - 1; i++) {
				if ((bit & (1 << i)) != 0) {
					list.get(bit).add("+");
				} else {
					list.get(bit).add("-");
				}
			}
		}

		String ans = "";

		for (int i = 0; i < list.size(); i++) {
			int sum = num[0];
			String s = String.valueOf(sum);
			for (int j = 0; j < list.get(i).size(); j++) {
				if (list.get(i).get(j).equals("+")) {
					sum += num[j + 1];
					s += "+" + String.valueOf(num[j + 1]);
				} else {
					sum -= num[j + 1];
					s += "-" + String.valueOf(num[j + 1]);
				}
			}
			if (sum == 7) {
				ans = s + "=7";
				break;
			}
		}
		System.out.println(ans);
	}
}