import java.util.Scanner;

//C問題
public class Main {
	public static void main(String[] args) {

		//スキャナーを宣言する
	    Scanner sc = new Scanner(System.in);

	    //入力を受け取る
	    int N = Integer.parseInt(sc.next());

	    int a[] = new int[N+1];
	    //全カードの合計値
	    int sum = 0;
	    int min = 1000000000;

	    //入力を受け取る
	    for(int cnt = 0; cnt < N; cnt++) {
	    	int tmp = Math.abs(Integer.parseInt(sc.next()));
	    	sum = sum + tmp;
	    	a[cnt] = tmp;
	    }
	    //スキャナーを閉じる
	    sc.close();

	    //スヌケくんが引いた枚数のシミュレーション
	    for(int cnt = N-1; cnt > 0; cnt--){
	    	int sunukesum = 0;
	    	for(int cnt2 = cnt; cnt2 > 0; cnt2--) {
	    		sunukesum = sunukesum + Math.abs(a[cnt2]);
	    	}
	    	if(Math.abs(sum -sunukesum) < min) {
	    		min = Math.abs(sum -sunukesum);
	    	}

	    }

	    System.out.println(min);
	}
}