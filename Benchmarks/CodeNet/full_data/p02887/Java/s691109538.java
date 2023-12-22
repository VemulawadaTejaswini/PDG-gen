import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next();

		// 計算
	    int result = 0;
	    char pre = s.charAt(0);
	    for(int i = 1; i < n; i++){
		    if(s.charAt(i) != pre){
		        result++;
		        pre = s.charAt(i);
		    }
		}
		result++;

		// 出力
		System.out.println(result);
        
	}
}
