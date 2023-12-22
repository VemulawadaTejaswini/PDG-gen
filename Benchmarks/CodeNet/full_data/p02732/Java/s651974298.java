import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int n = inputs.nextInt();
		int[] nums = new int[n];
		//stores value, how many
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			nums[i]=inputs.nextInt();
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 0);
			}
			map.put(nums[i], map.get(nums[i])+1);
		}
		long tot = 0;
		Set<Integer> temp = map.keySet();
		for(Integer i:temp) {
			int curr = map.get(i);
			if(curr>=2) {
				tot+=comb(curr);
			}
		}
		for(int k=0;k<n;k++) {
			long sum =tot;
			int bad = nums[k];
			int am = map.get(bad);
			if(am>=2) {
				sum+= (-1*am+1);
			}
			System.out.println(sum);
		}
		
	}
	static int comb(int n)
	{
		return n*(n-1)/2;
	}
}
