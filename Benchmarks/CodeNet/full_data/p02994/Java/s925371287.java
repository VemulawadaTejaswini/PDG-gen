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
    int L;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.L = sc.nextInt();
    }
    
    //解答処理
    private int solve() {
    	int answer = 0;
    	int min = Integer.MAX_VALUE;
        
        int[] taste = new int[N];
        for (int i = 0; i < N; i++) {
        	taste[i] = L + (i+1) - 1;
        	answer += taste[i];
        	min = Math.min(Math.abs(taste[i]), min);
        }
        
        if (L + N - 1 < 0) {
        	answer += min;
        } else {
        	answer -= min;
        }
        return answer;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
