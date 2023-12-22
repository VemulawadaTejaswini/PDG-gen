import java.util.*;

public class Main {

	void run() {

		//
		// 画面入力
		//
		Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] x = new int[N];
    	
    	int x_max = 0;
    	for(int i=0; i<N; i++){
			x[i] = sc.nextInt();
			if(x_max == 0) x_max=x[i];
			if(x[i] > x_max) x_max=x[i];
    	}
    	
		//
		// 処理
		//
    	// テスト
    	// ・境界値 x[i]=0のみ
    	// ・性能  x_max<=100, N<=100のため不要
    	//
    	int sum_min = 0;
    	for(int p = 0; p <= x_max; p++){
    		int sum_tmp = 0;
        	for(int j = 0; j < N; j++){
        		sum_tmp += Math.pow(x[j]-p, 2);
        	}
        	// 初期化
        	if(sum_min==0){
        		sum_min=sum_tmp;
        	}
        	if(sum_tmp < sum_min){
        		sum_min=sum_tmp;
        	}
    	}

		//
		// 画面出力
		//
    	System.out.println(sum_min);

		//
		// 後処理
		//
    	sc.close();
	}
	
    public static void main(String[] args) {
        new Main().run();
    }
}