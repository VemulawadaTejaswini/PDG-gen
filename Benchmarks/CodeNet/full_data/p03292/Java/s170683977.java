import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      	int b = sc.nextInt();
       	int c = sc.nextInt();
		// スペース区切りの整数の入力
      
		int i = a-b;
      	int n = Math.abs(i);
      	int j = b-c; 
      	int m = Math.abs(j);
		
		// 出力
		System.out.println(n+m);
	}
}