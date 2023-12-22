import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		// Nを入力
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();

        // ABCDEを入力
        long A;
        long min = (long)1e18;
        for(int i = 0; i < 5; i++){
        	A = scan.nextLong();
        	// ボトルネック箇所のキャパを算出
        	if(A < min){
        		min = A;
        	}
        }
        scan.close();
        
        // 答えを計算し出力
        long ans = (N + min - 1) / min + 4;
        System.out.println(ans);

	}
}
