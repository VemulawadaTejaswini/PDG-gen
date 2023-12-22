import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//N回ループ、a,bについてt回目のループ（＝t秒後）について可能か調べる
		Scanner sc = new Scanner(System.in);
		//Nの入力
		int N =sc.nextInt();
		boolean result =true;
		for(int i=1;N>=i;i++) {
		int a =sc.nextInt();
		int b =sc.nextInt();
			if(!(i-a-b>=0 && (i-a-b)%2==0)) {
				result =false;
			}
		}
		if(result){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
