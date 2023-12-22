import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		long b = sc.nextLong();
		long c = sc.nextLong();
		// 文字列の入力
		if(a + b + c < 22){
			System.out.println("win");
		}else{
			System.out.println("bust");
		}
		
		
		
	}
}