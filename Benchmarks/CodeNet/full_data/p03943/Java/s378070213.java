import java.util.Scanner;

public class MissionA {

	public static void main(String[] args) {
		
		//変数//
		int a;		//パックAの個数
		int b;		//パックBの個数
		int c;		//パックCの個数
		boolean ans = false;	//分けれるかどうか
		
		Scanner scan = new Scanner(System.in);
		
		//入力//
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		scan.close();
		
		//処理//
		if( a == b + c ){
			ans = true;
		}else if( b == a + c ){
			ans = true;
		}else if( c == a + b ){
			ans = true;
		}
		
		//結果//
		if(ans){
			System.out.println( "Yes" );
		}else{
			System.out.println( "No" );
		}

	}

}
