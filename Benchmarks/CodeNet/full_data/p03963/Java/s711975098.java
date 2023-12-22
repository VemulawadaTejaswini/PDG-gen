import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();// N
		int k = sc.nextInt();// K

		// 計算
		int pattern = 1;
		for(int i = 0; i < n; i++){
			if(i == 0){
				pattern = pattern * k;
			}else{
				pattern = pattern * (k - 1);
			}
		}
		// 出力
		System.out.println(pattern);
	}
}


