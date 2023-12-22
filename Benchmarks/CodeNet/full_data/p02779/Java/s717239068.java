import java.util.Arrays;
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
        A = new int[N];
        for (int i=0; i<N; i++) {
        	A[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private boolean solve() {
        Arrays.sort(A);
    	boolean judge = false;	//すべて異なっていればfalseのまま
        
        for (int i=1; i<N; i++) {
        	if (A[i] == A[i-1]) {
        		judge = true;
        		break;
        	}
        }
        
        return judge;
    }
    
    //出力
    public void show(boolean judge) {
        if (!judge) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
    }

}
