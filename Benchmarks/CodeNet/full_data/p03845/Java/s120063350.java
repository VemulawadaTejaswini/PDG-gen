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
    int N;	//問題数
    int[] T;	//解答にかかる時間
    int M;	//ドリンクの種類数
    int[] P;	//ドリンクに対応する問題
    int[] X;	//ドリンクを飲んだ時のPの解答にかかる時間
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        T = new int[N];
        for (int i=0; i<N; i++) {
        	T[i] = sc.nextInt();
        }
        this.M = sc.nextInt();
        P = new int[M];
        X = new int[M];
        for (int i=0; i<M; i++) {
        	P[i] = sc.nextInt();
        	X[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private int[] solve() {
    	int sum = 0;	//ドリンクを飲まなかったときの解答時間の総和
    	for (int i=0; i<N; i++) {
    		sum += T[i];
    	}
    	
        int[] total = new int[M];
        for (int i=0; i<M; i++) {
        	total[i] = sum - T[P[i]-1] + X[i];
        }
        
        return total;
    }
    
    //出力
    public void show(int[] answer) {
    	for (int i=0; i<answer.length; i++) {
    		System.out.println(answer[i]);   		
    	}
    }

}
