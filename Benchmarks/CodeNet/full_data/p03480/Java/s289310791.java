import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		long result = 0;
		boolean isZero = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int cnt = 0;
		for(int i = 0; i < s.length(); i++){
		    if(i == 0){
		        if(s.charAt(i) == '0') isZero = true;
		    }
		    if((s.charAt(i) == '0' && isZero)||(s.charAt(i) == '1' && !isZero)){
		        cnt++;
		    }else{
		        list.add(cnt);
		        cnt = 1;
		        isZero = !isZero;
		    }
		}
		list.add(cnt);
		//System.out.println(list.toString());
		if(list.size() == 1){
		    result = list.get(0);
		}else if(list.size() == 2){
		    result = max(list.get(0), list.get(1));
		}else{
		    result = list.get(0) + list.get(1);
		    for(int i = 2; i < list.size(); i++){
		        result = min(result, result - list.get(i-2) + list.get(i));
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

