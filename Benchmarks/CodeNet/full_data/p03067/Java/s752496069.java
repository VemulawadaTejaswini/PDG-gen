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
    int A;
    int B;
    int C;
    
    //入力
    Main2(Scanner sc) {
        this.sc = sc;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
    }
    
    //解答処理
    private boolean solve() {
        boolean judge = false;
        if ((A < C && C < B) || (B < C && C < A)) {
        	judge = true;
        }
        
        return judge;
    }
    
    //出力
    public void show(boolean answer) {
        if (answer) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}
