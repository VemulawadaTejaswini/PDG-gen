import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.solve();
        m.show();
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    int A;
    int B;
    int K;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        A = sc.nextInt();
        B = sc.nextInt();
        K = sc.nextInt();
    }
    
    //解答処理
    private void solve() {
    	for (int i=1; i<=K; i++) {//高橋君か青木君の操作で1回
    		if (i % 2 == 1) {	//高橋君の操作
    			if (A % 2 == 1) {
    				A--;
    			}
    			A = A/2;
    			B += A;
    		} else {	//青木君の操作
    			if (B % 2 == 1) {
    				B--;
    			}
    			B = B/2;
    			A += B;
    		}
    		
    	}
    	
    }
    
    //出力
    public void show() {
    	System.out.println(A + " " + B);
    }
}
