import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
      
        //aとbの大きさを判別する
      	if(a >= b){
          int maxCoin;
          maxCoin = a + (a-1);
        }else{
          maxCoin = b + (b-1);
        }
      //出力
      System.out.println(maxCoin);
          