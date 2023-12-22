import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String S = sc.next();                
		String T = sc.next();
		ArrayList<Character> x = new ArrayList<Character>();		
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != T.charAt(i)) {
				if (x.contains(T.charAt(i))) {
					System.out.println("No");
					return;
				}
				x.add(T.charAt(i));
				S = S.replace(S.charAt(i), '*').replace(T.charAt(i), S.charAt(i)).replace('*', T.charAt(i));
			}
		}
		if(S.equals(T)){
			System.out.println("Yes");			
		} else {
			System.out.println("No");			
		}
	}	
}
