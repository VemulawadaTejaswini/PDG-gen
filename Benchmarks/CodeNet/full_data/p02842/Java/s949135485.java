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
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
    }
    
    //解答処理
    private String solve() {
        String answer = ":(";
        
        if (N%1.08 == 0) {
        	answer = String.valueOf(N);
        } else {
        	for (int i=(int)(N/1.08); i<=N; i++) {
        		if (Math.floor(i*1.08) == N) {
        			answer = String.valueOf(i);
        			break;
        		}
        	}
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
