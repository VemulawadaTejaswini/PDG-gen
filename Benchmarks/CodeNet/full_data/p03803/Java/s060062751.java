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
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.A = sc.nextInt();
        this.B = sc.nextInt();
    }
    
    //解答処理
    private String solve() {
        String answer = null;
        
        if (A != 1 && B != 1) {
        	if (A > B) {
        		answer = "Alice";
        	} else if (A < B) {
        		answer = "Bob";
        	} else {
        		answer = "Draw";
        	}
        } else if (A == 1 && B != 1) {
        	answer = "Alice";
        } else if (A != 1 && B == 1) {
        	answer = "Bob";
        } else {
        	answer = "Draw";
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
