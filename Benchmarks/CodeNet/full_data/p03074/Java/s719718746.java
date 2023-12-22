import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		str = br.readLine().split("");
		ArrayList<Integer> nums = new ArrayList<>();

		if (str[0].equals("0"))
			nums.add(0);
		for (int i = 0; i < str.length;) {
			int j = i;
			while (j < str.length && str[j].equals(str[i]))
				++j;
			nums.add(j - i);
			i = j;
		}
		if (str[n - 1].equals("0"))
			nums.add(0);

		int s[] = new int[nums.size() + 1];

		for (int i = 0; i < nums.size(); i++) {
			s[i + 1] = s[i] + nums.get(i);
		}

		int ans = 0;
		for (int left = 0; left < nums.size(); left += 2) {
			int right = left + k * 2 + 1;
			if (right >= s.length)
				right = s.length - 1;
			ans = Math.max(ans, s[right] - s[left]);
		}
		System.out.println(ans);
	}
}