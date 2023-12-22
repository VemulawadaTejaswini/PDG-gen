import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String S = sc.next();
		Long K = sc.nextLong();
		if (S.length() < K) {
			for (int i = 0; i < S.length(); i++){
				if(S.charAt(i)!= '1'){
					System.out.println(S.charAt(i));
					return;
				}
			}
			System.out.println(1);			
		} else {
			for (int i = 0; i < K; i++){
				if(S.charAt(i)!= '1'){
					System.out.println(S.charAt(i));
					return;
				}
			}
			System.out.println(1);			
		}
	}	
}
