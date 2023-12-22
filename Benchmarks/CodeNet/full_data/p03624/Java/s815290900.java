import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		char result = 'a';
		char[] c = s.toCharArray();
		Arrays.sort(c);
		for(int i = 0; i < s.length(); i++){
		    if(result < c[i]){
		        System.out.println(result);
		        return;
		    }
		    result = (char)(c[i] + 1);
		}
		System.out.println("None");
		
		// 出力
		//System.out.println(result);
	}
}


