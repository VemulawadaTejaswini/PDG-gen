import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[][] info = new int[n][3];
		for(int i = 0; i < n; i++){
		    info[i][0] = sc.nextInt();
		    info[i][1] = sc.nextInt();
		    info[i][2] = sc.nextInt();
		}
		
		// 計算
		int[] result = new int[3];
		for(int x = 0; x <= 100; x++){
		    for(int y = 0; y <= 100; y++){
		        int calcH = -1;
		        boolean check = true;
		        for(int i = 0; i < n; i++){
		            if(info[i][2] == 100){
		                result[0] = info[i][0];
		                result[1] = info[i][1];
		                result[2] = info[i][2];
		                check = false;
		                break;
		            }else{
		                if(i == 0) calcH = abs(x - info[i][0]) + abs(y - info[i][1]) + info[i][2];
		                if(calcH != abs(x - info[i][0]) + abs(y - info[i][1]) + info[i][2]) check = false;
		            }
		        }
		        if(check){
		            result[0] = x;
		            result[1] = y;
		            result[2] = calcH;
		        }
		    }
		}
		// 出力
		System.out.println(result[0] + " " + result[1] + " " + result[2]);
		
	}
}