import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();

		for (int i=0; i<3; i++){
			nums.add(Integer.parseInt(sc.next()));
		}

		Collections.sort(nums, Collections.reverseOrder());

		int diff1 = nums.get(0) - nums.get(1);
		int diff2 = nums.get(0) - nums.get(2);

		int ans = 0;
		ans += diff1;

		if ((diff2 - diff1)%2==0){
			ans += (diff2 - diff1)/2;
		}else {
			ans += (diff2 - diff1)/2 + 2;
		}

		System.out.println(ans);
	}
}
