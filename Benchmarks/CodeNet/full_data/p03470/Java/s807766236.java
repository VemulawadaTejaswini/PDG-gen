import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Nを取得します
		int n = sc.nextInt();
		//diを取得します
		Set<Integer> d = new HashSet<Integer>();
		for (int i = 0 ; i < n ; i++ ) {
			int dIn = sc.nextInt();
			d.add(dIn);
		}
		
		int ans = d.size();
		
		/**
		 * 答えを出力します
		 */
			
		System.out.println(ans);
		
	}

}
