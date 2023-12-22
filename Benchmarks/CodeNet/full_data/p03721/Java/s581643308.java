import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<Integer, Integer> nums = new HashMap<Integer,Integer>();
		ArrayList<Integer> keys = new ArrayList<Integer>();
		int n = input.nextInt();
		int k = input.nextInt();
		for (int i = 0; i < n; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			if(!keys.contains(a)) {
				keys.add(a);
				nums.put(a, b);
			} else {
				nums.put(a, b + nums.get(a));
			}
		}
		int sum = 0;
		for (int j = 0; j < keys.size(); j++) {
			if (sum + nums.get(keys.get(j)) >= k) {
				System.out.println(keys.get(j));
				break;
			}else {
				sum += nums.get(keys.get(j));
			}
		}
	}
}





