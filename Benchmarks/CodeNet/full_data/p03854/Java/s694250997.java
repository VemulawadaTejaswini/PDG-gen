import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		String s = sc.next();// 文字列

		// チェック
		String result = "";

		if(check(s)){
			result = "YES";
		}else{
			result = "NO";
		}

		// 出力
		System.out.println(result);
	}

	static boolean check(String s){

		// 定数
		String a  = "dream";
		String b  = "dreamer";
		String c  = "erase";
		String d  = "eraser";

		if(s.equals(a) || s.equals(b) || s.equals(c) || s.equals(d)){
			return true;
		}
		if(s.startsWith(a)){
			if(check(s.substring(a.length()))){
				return true;
			}
			if(check(s.substring(a.length() + 2))){
				return true;
			}
		}
		if(s.startsWith(c)){
			if(check(s.substring(c.length()))){
				return true;
			}
			if(check(s.substring(c.length() + 1))){
				return true;
			}
		}
		return false;
	}

}


