import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		int result = 0;
		char pre = s.charAt(0);
		for(int i = 1; i < s.length(); i++){
		    char c = s.charAt(i);
		    if(pre == c){
		        result++;
		        if(c == '0'){
		            c = '1';
		        }else{
		            c = '0';
		        }
		        pre = c;
		    }else{
		        pre = c;
		    }
		}

		
		// 出力
		System.out.println(result);
        
	}
}