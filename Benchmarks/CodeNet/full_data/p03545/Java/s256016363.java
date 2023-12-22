import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		String s = sc.next();// 

		String[] str = s.split("");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int d = Integer.parseInt(str[3]);

		// 計算
		String result;

		result = path("", 1, 0, a, b, c, d);
		result = result.substring(0, 9);

		// 出力
		System.out.println(result);
	}

	static String path(String p, int depth, int cal, int a, int b, int c, int d){
		if(depth == 1){
			return path(p + a, depth + 1, a, a, b, c, d);
		}
		if(depth == 2){
			return path(p + "+" + b, depth + 1, cal + b, a, b, c, d) + path(p + "-" + b, depth + 1, cal - b, a, b, c, d);
		}
		if(depth == 3){
			return path(p + "+" + c, depth + 1, cal + c, a, b, c, d) + path(p + "-" + c, depth + 1, cal - c, a, b, c, d);
		}
		if(depth == 4){
			return path(p + "+" + d, depth + 1, cal + d, a, b, c, d) + path(p + "-" + d, depth + 1, cal - d, a, b, c, d);
		}

		if(cal == 7) return p + "=7";
		return "";
	}
}


