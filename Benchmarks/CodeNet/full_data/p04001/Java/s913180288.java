import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//java11
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int length = s.length();

		long ans = 0;

		//bit全探索
		for(int i=0; i<(1 << length-1); i++) {
			List<Integer> plus = new ArrayList<>();

			for(int j=0; j<length-1; j++) {
				if((1 & (i >> j)) == 1) {
					plus.add(j);
				}
			}

			StringBuilder sb = new StringBuilder(s);

			int index = 0;
			for(int j=0; j<plus.size(); j++) {
				int a = plus.get(j);
				sb.insert(a+1+index, "+");
				index++;
			}

			String[] nums = sb.toString().split("\\+");

			for(int j=0; j<nums.length; j++) {
				ans += Long.parseLong(nums[j]);
			}
		}

		System.out.println(ans);

	}

}
