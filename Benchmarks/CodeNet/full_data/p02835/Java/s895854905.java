import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
		// 出力
      if(a+b+c>=22){
		System.out.println("bust");
      }else if(a+b+c<21){
        System.out.println("win");
      }
	}
}