import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();

		// 計算
		int cnt = 0;
		for(int i = 2; i <= 55555; i++){
		    if(i%5 != 1) continue;
		    boolean flg = true;
		    for(int j = 2; j <= sqrt(i); j++){
		        //System.out.println("i:" + i + " j:" + j);
		        if(i%j == 0){
		            flg = false;
		            break;
		        }
		    }
		    if(flg){
		        System.out.print(i + " ");
		        cnt++;
		        if(cnt == n) break;
		    }
		}

		// 出力
		//System.out.println("cnt:" + cnt);
	}
}
