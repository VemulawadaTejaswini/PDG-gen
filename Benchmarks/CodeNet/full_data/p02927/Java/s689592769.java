import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int m = sc.nextInt();
		int d = sc.nextInt();


		// 計算
		int result = 0;
		
		if(d < 22){
		}else{
    		for(int i = 1; i < m + 1; i++){
    		    for(int j = 22; j < d + 1; j++){
    		        
    		        int b = j%10;
    		        
    		        int a = (j - b)/10;
    		        
    		        if(b > 1 && i == a*b){
    		            result++;

    		        }
    		        
    		    }
    		}
		}

		// 出力
		System.out.println(result);
	}

}
