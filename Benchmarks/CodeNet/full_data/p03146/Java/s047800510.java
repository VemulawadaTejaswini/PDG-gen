import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int s = sc.nextInt();

		// 計算
		int result = 1;
		int next = s;
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(next);
		while(true){
		    result++;
		    if(next%2 == 0){
		        next /= 2;
		    }else{
		        next = 3 * next + 1;
		    }
		    if(hs.contains(next)){
		        break;
		    }else{
		        hs.add(next);
		    }
		}

		// 出力
		System.out.println(result);
        
	}
}
