import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if (( a < c) & ( c < b)){
			if ( b < d){
				System.out.println(b - c);
				return;
			}else{
				System.out.println(d - c);
				return;
			}
		}else{
			if (( c < a) & ( a < d)){
				if ( d < b){
					System.out.println(a - d);
					return;
				}else{
					System.out.println(b - d);
					return;
				}
			}
		}
		System.out.println(0);				
	}
}
