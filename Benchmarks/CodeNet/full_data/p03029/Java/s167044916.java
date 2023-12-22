import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//整数型を宣言して読み込む
		int A = sc.nextInt();
		int B = sc.nextInt();		
		//整数型配列の宣言と初期化	
		int ans=0;
		ans=(3*A+B)/2;
		System.out.println(ans);
	}
}