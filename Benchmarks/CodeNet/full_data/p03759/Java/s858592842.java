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
    int a;
    int b;
    int c;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.a = sc.nextInt();
        this.b = sc.nextInt();
        this.c = sc.nextInt();
    }
    
    //解答処理
    private String solve() {
        String answer = "NO";
        if (b-a == c-b) {
        	answer = "YES";
        }
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
