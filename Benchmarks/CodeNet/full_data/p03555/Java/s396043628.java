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
    String C1;
    String C2;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        C1 = sc.nextLine();
        C2 = sc.nextLine();
    }
    
    //解答処理
    private String solve() {
        String answer = "NO";
        String c2 = new StringBuilder(C2).reverse().toString();
        
        if (C1.equals(c2)) {
        	answer = "YES";
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
