import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        char[] chars = sc.next().toCharArray();
        
        int[] map = new int[26];
		for (char c : chars) {
			map[c-'a']++;
		}
		
		long sum = 1;
		for (int count : map) {
			sum *= (count+1) % 1_000_000_007;
		}
		
		System.out.println(sum - 1);
    }
}