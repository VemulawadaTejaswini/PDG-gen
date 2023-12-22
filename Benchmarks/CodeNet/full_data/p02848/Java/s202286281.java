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
        this.S= sc.next(); 
    }
    
    //解答処理
    private StringBuilder solve() {
    	StringBuilder answer = new StringBuilder();
        
        for (int i=0; i<S.length(); i++) {
        	char tmp = (char)(S.charAt(i)+ N);
        	//ASCIIコードが90(Z)を超えた場合
        	if (tmp > 90) {
        		tmp = (char)(S.charAt(i) - 26 + N);
        	}
        	answer.append(tmp);
        }
        
        return answer;
    }
    
    //出力
    public void show(StringBuilder answer) {
        System.out.println(answer);
    }

}
