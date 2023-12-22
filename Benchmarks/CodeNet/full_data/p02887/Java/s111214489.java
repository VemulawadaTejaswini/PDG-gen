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
    String S;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.S = sc.next();
    }
    
    //解答処理
    private int solve() {
        int count = 0;
        StringBuilder S2 = new StringBuilder(String.valueOf(S.charAt(0)));
        
        
        for (int i=1; i<S.length(); i++) {
        	if (S.charAt(i) == S.charAt(i-1)) {
        		continue;
        	} else {
        		S2.append(String.valueOf(S.charAt(i)));
        	}
        }
        
        count = S2.toString().length();
        return count;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
