import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		//変数//
		int A;		//入力A
		int B;		//入力B
		int ans;	//出力結果
		String op;	//入力OP
		
		Scanner scan = new Scanner(System.in);
		
		//入力//
		A = scan.nextInt();
		op = scan.next();
		B = scan.nextInt();
		
		scan.close();
		
		//処理//
		if( op.equals("+") ){
			ans = A + B;
		}else{
			ans = A - B;
		}
		
		//結果//	
		System.out.println(ans);
		
		}
}
