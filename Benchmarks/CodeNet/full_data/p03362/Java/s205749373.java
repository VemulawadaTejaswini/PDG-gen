import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 解説見た後

		// 標準入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> nums = new ArrayList<Integer>();

		int so = 7;

		for (int i = 0; i < n; i++) {
			while (true) {
				so++;
				boolean sosuflag = true;
				for (int j = 2; j < so; j++) {
					if (so % j == 0) {
						sosuflag = false;
						break;
					}
				}
				if (sosuflag && so % 5 == 1) {
					nums.add(so);
					break;
				}
			}

		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(nums.get(i) + " ");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);

	}

}