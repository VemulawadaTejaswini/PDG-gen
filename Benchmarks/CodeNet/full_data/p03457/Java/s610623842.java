import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//N回ループ、a,bについてt回目のループ（＝t秒後）について可能か調べる
		Scanner sc = new Scanner(System.in);
		//Nの入力
		int N =sc.nextInt();
		boolean result =true;
		for(int i=0;N>i;i++) {
		int t =sc.nextInt();
		int a =sc.nextInt();
		int b =sc.nextInt();
			if(!(t-a-b>=0 && (t-a-b)%2==0)) {
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
