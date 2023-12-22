import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		String t = sc.next();
		
		// 計算
		String result = "UNRESTORABLE";
		for(int i = s.length()-t.length(); i >= 0; i--){
		    boolean flg = true;
		    for(int j = 0; j < t.length(); j++){
		        if(i+j >= s.length()){
		            flg = false;
		            break;
		        }
		        if(s.charAt(i+j) != t.charAt(j) && s.charAt(i+j) != '?'){
		            flg = false;
		        }
		    }
		    if(flg){
		        String newS = s.replace('?', 'a');
		        result = newS.substring(0, i) + t + newS.substring(i+t.length());
		        break;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

