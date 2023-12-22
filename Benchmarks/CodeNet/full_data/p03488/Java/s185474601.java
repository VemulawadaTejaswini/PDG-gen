import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		
		// 計算
		String result = "No";
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
		    if(s.charAt(i) == 'F'){
		        if(cnt > 0 && cnt%2 == 1) sb.append("C");
		        if(cnt > 0 && cnt%2 == 0) sb.append("B");
		        cnt = 0;
		        sb.append("F");
		    }else{
		        cnt++;
		    }
		}
		if(cnt > 0 && cnt%2 == 1) sb.append("C");
		if(cnt > 0 && cnt%2 == 0) sb.append("B");
		String move = sb.toString();
		if(can(move, 1, 0, 0, 0, tx, ty)) result = "Yes";
		
		// 出力
		System.out.println(result);
	}
	
	static boolean can(String move, int dx, int dy, int x, int y, int tx, int ty){
	    if(move.equals("")){
	        if(x == tx && y == ty) return true;
	        return false;
	    }
	    if(move.charAt(0) == 'F'){
	        return can(move.substring(1), dx, dy, x+dx, y+dy, tx, ty);
	    }else if(move.charAt(0) == 'C'){
	        return can(move.substring(1), dy, dx, x, y, tx, ty) ||
	               can(move.substring(1), -dy, -dx, x, y, tx, ty);
	    }else{
	        return can(move.substring(1), dx, dy, x, y, tx, ty) ||
	               can(move.substring(1), -dx, -dy, x, y, tx, ty);
	    }
	}
}

