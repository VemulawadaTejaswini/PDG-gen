import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String S = sc.next();
		String ans = "";
		if (!S.substring(0,1).equals("A")) {
			System.out.println("WA");
			return;
		}
		int C = 0;
		for (int i = 2; i < S.length()-1; i++) {
			if(S.charAt(i) == 'C'){
				C++;
			}
		}
		if(C!=1){
			System.out.println("WA");
			return;
		}
		if (ans.equals("wa")) {
			return;
		}
		String s = S.substring(1,S.length()).replace('C', 'c');
		if(!s.equals(s.toLowerCase())){
			System.out.println("WA");
			return;
		}
		System.out.println("AC");
	}	
}
