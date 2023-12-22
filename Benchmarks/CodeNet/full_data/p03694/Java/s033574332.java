import java.util.Scanner;

//B問題
public class Main {
	public static void main(String[] args) {

		/*
		[開発方針]
		最大値-最小値で距離を求める
		 */

		//スキャナーを宣言する
	    Scanner sc = new Scanner(System.in);

	    //入力を受け取る
	    int N = Integer.parseInt(sc.next());
	    int a;
	    int max = 1;
	    int min = 100;

	    for(int cnt = 0; cnt < N; cnt++) {
	    	a = Integer.parseInt(sc.next());
	    	if(a >= max) {
	    		max = a;
	    	}
	    	if(a <= min) {
	    		min = a;
	    	}
	    }

	    //スキャナーを閉じる
	    sc.close();

	    //距離を出力
	    System.out.println(max - min);
	}
}