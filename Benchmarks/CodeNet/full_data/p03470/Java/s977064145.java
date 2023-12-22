import java.util.Arrays;
import java.util.Collections;
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
    Integer[] d;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        d = new Integer[N];
        for (int i = 0; i < N; i++) {
        	this.d[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private int solve() {
        int count = 1;
        Arrays.sort(d, Collections.reverseOrder());

        for (int i = 1; i < N; i++) {
        	if (d[i] < d[i-1]) {
        		count++;
        	}
        }
        
        return count;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
