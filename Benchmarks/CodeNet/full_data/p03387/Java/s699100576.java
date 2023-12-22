import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int[] ary = new int[3];
		for(int i = 0; i < 3; i++) {
			ary[i] = scanner.nextInt();
		}
		Arrays.sort(ary);
		// c - b の数 +1 できる
		// b - a が偶数 -> a + 2 1kai
		// false -> bc +1 a +2 2 2kai
		int ans = ary[2] - ary[1];
		ans += (ary[1] - ary[0]) / 2 + (ary[1] - ary[0]) % 2; 
		
		System.out.println(ans);
	}

}