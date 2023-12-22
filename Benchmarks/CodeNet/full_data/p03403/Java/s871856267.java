import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    int N;
    int[] A;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.A = new int[N+2];
        for (int i = 1; i <= N; i++) {
        	this.A[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private List<Integer> solve() {
    	List<Integer> answer = new ArrayList<Integer>();
    	int sum = 0;
    	
    	for (int i = 1; i < N+2; i++) {
    		//全て訪れたときの総額を求める
    		sum += Math.abs(A[i] - A[i-1]);
    	}
    	
    	for (int i = 1; i < N+1; i++) {
    		//A[i] ⇒ 観光を取りやめる場所
    		//求める金額 = 総金額 - A[i+1]からA[i]に行くための金額 - A[i]からA[i+1]に行くための金額 +　A[i-1]からA[i+1]に行くための金額
    		int ans = sum - Math.abs(A[i]-A[i-1]) - Math.abs(A[i+1]-A[i]) + Math.abs(A[i+1]-A[i-1]);
    		answer.add(ans);
    	}
        
        return answer;
    }
    
    //出力
    public void show(List<Integer> answer) {
    	for (int i = 0; i < answer.size(); i++) {
    		System.out.println(answer.get(i));
    	}
    }

}
