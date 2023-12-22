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
    long X;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        X = sc.nextLong();
    }
    
    //解答処理
    private long solve() {
        long happy = 0;
         while (X >= 500) {
        	 happy += 1000;
        	 X -= 500;
         }
         while (X >= 5) {
        	 happy += 5;
        	 X -= 5;
         }
        
        return happy;
    }
    
    //出力
    public void show(long answer) {
        System.out.println(answer);
    }

}
