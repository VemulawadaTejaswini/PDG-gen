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
    int[] C;	//次の駅到着にかかる時間
    int[] S;	//各駅の最初の発車時間(開通式後)
    int[] F;	//各駅の二番目以降の発車時刻の間隔
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        C = new int[N-1];
        S = new int[N-1];
        F = new int[N-1];
        for (int i=0; i<N-1; i++) {
        	C[i] = sc.nextInt();
        	S[i] = sc.nextInt();
        	F[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private int[] solve() {
        int[] x = new int[N];
        
        for (int i=0; i<N; i++) {	//i番目の駅から出発
        	int t = 0;  //現在時刻
        	for (int j=i; j<N-1; j++) {	//j番目の駅からN番目の駅までの移動
        		if (t <S[j]) {	//その駅の始発がまだ出ていないとき
        			t = S[j] + C[j];
        		} else if (t%F[j] == 0) {
        			t += C[j];
        		} else {
        			t += t + F[j] - t%F[j] + C[j];
        		}
        	}
        	x[i] = t;
        }
        
        return x;
    }
    
    //出力
    public void show(int[] answer) {
        for (int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);       	
        }
    }

}
