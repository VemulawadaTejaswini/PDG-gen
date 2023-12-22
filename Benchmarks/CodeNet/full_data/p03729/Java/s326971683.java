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
    String A;
    String B;
    String C;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.A = sc.next();
        this.B = sc.next();
        this.C = sc.next();
    }
    
    //解答処理
    private String solve() {
        String answer = "NO";
        if (A.charAt(A.length()-1)==B.charAt(0) && B.charAt(B.length()-1)==C.charAt(0)) {
        	answer = "YES";
        }
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
