import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		Arrays.sort(s);

		List<String> ans = new ArrayList<>();
		int maxNum = 0;

		//同じ文字列がいくつ連続するのかを判定。連続数が最大値に一致していればlistに追加。最大値を上回ったらlistを空にしてから追加。
		for (int i = 0; i < n - 1;) {
			int j = i + 1;
			int num = 1;

			while (s[i].equals(s[j])) {
				num++;
				j++;
				if(j == n) {
					break;
				}
			}

			if (num > maxNum) {
				ans.clear();
				ans.add(s[i]);
				maxNum = num;
			} else if (num == maxNum) {
				ans.add(s[i]);
			}

			i = j;
		}

		if (maxNum == 1) {
			ans.add(s[n - 1]);
		}

		Collections.sort(ans);

		for(int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}

}
