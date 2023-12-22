import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();

		List<Integer> nums = new ArrayList<>(Arrays.asList(P,Q,R));
		Collections.sort(nums);

		System.out.println(nums.get(0)+nums.get(1));

	}

}
