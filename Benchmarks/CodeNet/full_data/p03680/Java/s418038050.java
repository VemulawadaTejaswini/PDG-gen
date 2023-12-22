import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
		    b[i] = sc.nextInt()-1;
		}
		
		// 計算
		int result = -1;
		int index = 0;
		int next = 0;
		for(int i = 0; i < n; i++){
		    if(b[index] < 0) break;
		    if(b[index] == 1){
		        result = i+1;
		        break;
		    }else{
		        next = b[index];
		        b[index] = -1;
		    }
		    index = next;
		}
		
		
		// 出力
		System.out.println(result);
	}
}
