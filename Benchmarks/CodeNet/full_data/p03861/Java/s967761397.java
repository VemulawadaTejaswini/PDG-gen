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
    long a;
    long b;
    long x;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.a = sc.nextLong();
        this.b = sc.nextLong();
        this.x = sc.nextLong();
    }
    
    //解答処理
    private long solve() {
    	long answer = 0;
        long A = a / x;
        long B = b / x;
        if (a % x == 0) { //aも条件を満たすとき
        	answer = B - A + 1;
        } else {
        	answer = B - A;
        }
        return answer;
    }
    
    //出力
    public void show(long answer) {
        System.out.println(answer);
    }

}
