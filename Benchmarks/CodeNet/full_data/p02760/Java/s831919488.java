import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			boolean mark[] = new boolean[9];
			
			Map<Integer, Integer> numMap = new HashMap<>();
			
			for(int i = 0 ; i < 9 ; i++ ) {
				numMap.put(sc.nextInt(), i);
			}
			
			int n = sc.nextInt();
			
			for(int i = 0 ; i < n ; i++ ) {
				int b = sc.nextInt();
				if ( numMap.containsKey(b) ) {
					int index = numMap.get(b);
					mark[index] = true;
				}
			}
			
			//check
			boolean bingo = false;
			for(int i = 0 ; i < 2 ; i++ ) {
				if ( mark[i*3] && mark[i*3+1] && mark[i*3+2]) {
					bingo = true;
					break;
				}
				if ( mark[i] && mark[i+3] && mark[i+6]) {
					bingo = true;
					break;
				}
			}
			if ( mark[0] && mark[4] && mark[8] ||
					mark[2] && mark[4] && mark[6] ) {
				bingo = true;
			}
			
			System.out.println(bingo ? "Yes" : "No");
		}
	}
}