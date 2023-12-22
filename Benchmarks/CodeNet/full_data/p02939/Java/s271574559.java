import java.util.*;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] array = input.toCharArray();
		List<Integer> nums = new ArrayList<>();
		char prevC = array[0];
		int cnt = 0;
		for(char c : array){
			if(c != prevC){
				nums.add(cnt);
				cnt = 0;
			}
			cnt++;
			prevC = c;
		}
		nums.add(cnt);

		int ans = 0;
		boolean add = false;
		for(int num : nums){
			if(add){
				ans++;
				num--;
			}
			ans += (int)(num/3) * 2;
			if(num%3 != 0) ans += 1;
			add = num%3 == 2 ? true : false;
		}

		System.out.println(ans);
	}
}