import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			nums.add(num);
			nums.add(num - 1);
			nums.add(num + 1);
		}
		int ans = 0;
		TreeSet<Integer> map = new TreeSet<Integer>(nums);
		for(int m : map) {
			int count = 0;
			for(int a : nums) {
				if(m == a) count += 1;
			}
			if(count > ans) ans = count; 
		}
		System.out.println(ans);
	}
}