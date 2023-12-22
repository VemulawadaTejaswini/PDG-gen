import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int x = sc.nextInt();

		long total = calcTotal(n);



	}

	private long calcTotal( int n ) {
		if(n==1){
			return 5;
		}
		return 3 + calcTotal(n-1)*2;
	}


}