import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int k = sc.nextInt();
			int c = sc.nextInt();
			String s = sc.next();

			//もともとoである対象日をxとした場合に答えが求められるかどうかで決定する
			//充足探索関数を作る
			for(int i = 0 ; i < n ; i++ ) {
//				System.out.println(i+1);
				if ( !canWork(k , c , s, i, 0)) {
					System.out.println(i+1);
				}
			}
		}	
	}
	
	private static HashMap<String, Boolean> cache = new HashMap<>();

	private static boolean canWork(int k, int c, String s, int target, int current) {

		if ( k == 0 ) {
			return true;
		}
		//find first o and (not target) from current
		while(current < s.length()) {
			if ( current > target && cache.containsKey(current + "_" + k) ) {
//				System.out.println("## current = "+ current + ", " + cache.get(current + "_" + k));
				return cache.get(current + "_" + k);
			}
			if ( s.charAt(current) == 'o' && target != current ) {
//				System.out.println(String.format("## %d, %d, %d", k, target, current));
				//find first work;
				
				//find next
				int baseCurrent = current;
				current += c+1;
				boolean result = canWork(k-1, c, s, target, current);
				
				if ( baseCurrent > target ) {
					cache.put(baseCurrent + "_" + k, result);
				}
				
				return result;
			}
			current++;
		}
		return false;
	}


}