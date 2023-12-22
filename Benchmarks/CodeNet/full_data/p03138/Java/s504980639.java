import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Long[] nums = new Long[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextLong();
		}
		long max = Long.MIN_VALUE;
		
		List<List<Long>> lists = new ArrayList<List<Long>>();
		for(int i=0; i<=k; i++) {
			int x = i;
			List<Long> list = new ArrayList<Long>();
			for(int j=0; j<n; j++) {
				list.add(x^nums[j]);
			}
			lists.add(list);
		}
		for(int i=0; i<lists.size(); i++) {
			List<Long> tmpList = lists.get(i);
			long sum = 0;
			for(int j=0; j<tmpList.size(); j++) {
				sum += tmpList.get(j);
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}
}
