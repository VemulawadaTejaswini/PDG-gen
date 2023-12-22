import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int result = 0;
		if(n>9){
			result += 9;
		}else{
			result += n;
		}

		if(n<=99){

		}else if (n>999){
			result +=900;
		}else{
			result += n-99;
		}

		if(n<=9999){
			
		}else if(n==100000){
			result +=90000;
		}else{
			result += n-9999;
		}
		System.out.println(result);


	}



}
