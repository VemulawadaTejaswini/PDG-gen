import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 配列数の決定
		int number = sc.nextInt();
		
		//LeftNumberの決定
		int LeftNumber[] = new int[number];
		for(int i = 0; i < number; i++) {
			 LeftNumber[i] = sc.nextInt();
		}
		
		//RightNumberの決定
		int RightNumber[] = new int[number];
		for(int i = 0; i < number; i++) {
			 RightNumber[i] = sc.nextInt();
		}
		
		
		//引き算の結果を受けて加算していく
		int Sum = 0;
		int sa = 0;
		for(int i = 0; i < number; i++) {
			sa =  LeftNumber[i] -  RightNumber[i];
			if(sa > 0){
				Sum = Sum + sa;
			}
		}
		
		// 出力
		System.out.println(Sum);
	}
}