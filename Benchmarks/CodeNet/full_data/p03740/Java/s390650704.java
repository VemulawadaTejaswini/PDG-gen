import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long X =scan.nextInt();
		long Y =scan.nextInt();

		//Alice win true?

		String winner;
		if(judge(X,Y)){
			winner = "Alice";
		}else{
			winner ="Brown";
		}

		System.out.println(winner);


	}


	static boolean judge(long X,long Y){
		if(X<2&&Y<2){
			return false;//負け
		}

		for(int i=1;2*i<=X;i++){
			if(!judge(X-2*i,Y+i)){
				return true;//あるiで勝てる
			}
		}
		for(int i=1;2*i<=Y;i++){
			if(!judge(X+i,Y-2*i)){
				return true;
			}
		}

		//全てのiで負ける
		return false;

	}


}
