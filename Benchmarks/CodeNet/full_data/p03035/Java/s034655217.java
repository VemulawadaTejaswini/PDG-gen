import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		// 出力
		
		if(b%2==0) {
			if ( a>=0 && a<6 )  {
				System.out.println(0);
			} else if ( a>=6 && a<13 ){
				System.out.println(b/2);
			} else if ( a>=13 && a<= 100){
				System.out.println(b);
			} else {
			}
		}
	}
}