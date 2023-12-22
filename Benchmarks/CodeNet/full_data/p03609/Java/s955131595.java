import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int X = sc.nextInt();
		int t= sc.nextInt();
		//計算
		
		int result = X - t*1;
		if (result>=0){
			 System.out.println(result);	
		}else if (result <0){
			 System.out.println(0);
		}
	
	    
		
		
	}
}